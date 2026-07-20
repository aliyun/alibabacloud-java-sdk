// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409;

import com.aliyun.tea.*;
import com.aliyun.smqproxy20260409.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "SMQProxy";
        com.aliyun.gateway.mns.Client gatewayClient = new com.aliyun.gateway.mns.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
    }


    /**
     * <b>summary</b> : 
     * <p>批量删除消息</p>
     * 
     * @param request BatchDeleteMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteMessageResponse
     */
    public BatchDeleteMessageResponse batchDeleteMessageWithOptions(String queueName, BatchDeleteMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.receiptHandles)) {
            body.put("ReceiptHandles", request.receiptHandles);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new BatchDeleteMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除消息</p>
     * 
     * @param request BatchDeleteMessageRequest
     * @return BatchDeleteMessageResponse
     */
    public BatchDeleteMessageResponse batchDeleteMessage(String queueName, BatchDeleteMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeleteMessageWithOptions(queueName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于批量查看指定队列中的消息，一次最多可以查看16条消息。</li>
     * <li>使用此接口不会改变消息的状态，消息仍保持为Active状态。</li>
     * <li>不支持长轮询功能。</li>
     * <li>需要提供<code>queueName</code>作为路径参数，并通过查询参数设置<code>peekonly=true</code>及指定要查看的消息数量<code>numOfMessages</code>（范围在1到16之间）。</li>
     * <li>成功响应将返回一个包含所请求消息详细信息的数组，包括但不限于消息ID、正文、入队时间等。</li>
     * <li>如果指定的队列不存在或队列中没有可见消息，则会返回相应的错误码。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量查看消息</p>
     * 
     * @param request BatchPeekMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchPeekMessageResponse
     */
    public BatchPeekMessageResponse batchPeekMessageWithOptions(String queueName, BatchPeekMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.numOfMessages)) {
            query.put("numOfMessages", request.numOfMessages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peekonly)) {
            query.put("peekonly", request.peekonly);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchPeekMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new BatchPeekMessageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于批量查看指定队列中的消息，一次最多可以查看16条消息。</li>
     * <li>使用此接口不会改变消息的状态，消息仍保持为Active状态。</li>
     * <li>不支持长轮询功能。</li>
     * <li>需要提供<code>queueName</code>作为路径参数，并通过查询参数设置<code>peekonly=true</code>及指定要查看的消息数量<code>numOfMessages</code>（范围在1到16之间）。</li>
     * <li>成功响应将返回一个包含所请求消息详细信息的数组，包括但不限于消息ID、正文、入队时间等。</li>
     * <li>如果指定的队列不存在或队列中没有可见消息，则会返回相应的错误码。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量查看消息</p>
     * 
     * @param request BatchPeekMessageRequest
     * @return BatchPeekMessageResponse
     */
    public BatchPeekMessageResponse batchPeekMessage(String queueName, BatchPeekMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchPeekMessageWithOptions(queueName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该操作会将取得的消息状态变为 Inactive，Inactive 持续时间由队列属性 <code>VisibilityTimeout</code> 决定。</li>
     * <li>消费者需在 VisibilityTimeout 时间内调用 DeleteMessage 删除消息，否则消息会重新变为 Active。</li>
     * <li>支持长轮询（Long Polling）：设置 <code>waitseconds &gt; 0</code> 后，若队列为空则等待至有消息到达或超时返回。<blockquote>
     * <p>Notice: 进入长轮询后，建议您降低外部调用长轮询的并发数，选择合适的长轮询时间。目前服务端会根据长轮询数量、长轮询等待时间、访问 IP 数量等因素动态调整长轮询防攻击的并发上限值。当队列无消息时，超过长轮询上限值的请求将无法被监听到，并直接返回 404 MessageNotExist（按请求量正常计费）。如果您有临时提升长轮询上限值的需求，请及时提交工单。</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量消费消息</p>
     * 
     * @param request BatchReceiveMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchReceiveMessageResponse
     */
    public BatchReceiveMessageResponse batchReceiveMessageWithOptions(String queueName, BatchReceiveMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.numOfMessages)) {
            query.put("numOfMessages", request.numOfMessages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitseconds)) {
            query.put("waitseconds", request.waitseconds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchReceiveMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new BatchReceiveMessageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该操作会将取得的消息状态变为 Inactive，Inactive 持续时间由队列属性 <code>VisibilityTimeout</code> 决定。</li>
     * <li>消费者需在 VisibilityTimeout 时间内调用 DeleteMessage 删除消息，否则消息会重新变为 Active。</li>
     * <li>支持长轮询（Long Polling）：设置 <code>waitseconds &gt; 0</code> 后，若队列为空则等待至有消息到达或超时返回。<blockquote>
     * <p>Notice: 进入长轮询后，建议您降低外部调用长轮询的并发数，选择合适的长轮询时间。目前服务端会根据长轮询数量、长轮询等待时间、访问 IP 数量等因素动态调整长轮询防攻击的并发上限值。当队列无消息时，超过长轮询上限值的请求将无法被监听到，并直接返回 404 MessageNotExist（按请求量正常计费）。如果您有临时提升长轮询上限值的需求，请及时提交工单。</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量消费消息</p>
     * 
     * @param request BatchReceiveMessageRequest
     * @return BatchReceiveMessageResponse
     */
    public BatchReceiveMessageResponse batchReceiveMessage(String queueName, BatchReceiveMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchReceiveMessageWithOptions(queueName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>一次 Batch 请求的消息总大小不得超过 64 KB。</li>
     * <li><code>BatchSendMessage</code> 与 <code>SendMessage</code> 使用相同的 URL 路径，通过 Body 结构区分：包含 <code>Messages</code> 数组即为批量发送，否则为单条发送。</li>
     * <li>批量操作的返回结果可能同时包含成功和失败的子消息。</li>
     * <li>每次请求中可以包含多个消息对象，每个消息对象可以设置不同的延迟时间和优先级。</li>
     * <li>对于 FIFO 队列，可以通过 <code>MessageGroupId</code> 参数来指定消息分组 ID。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量发送消息</p>
     * 
     * @param request BatchSendMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSendMessageResponse
     */
    public BatchSendMessageResponse batchSendMessageWithOptions(String queueName, BatchSendMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("Messages", request.messages);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSendMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new BatchSendMessageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>一次 Batch 请求的消息总大小不得超过 64 KB。</li>
     * <li><code>BatchSendMessage</code> 与 <code>SendMessage</code> 使用相同的 URL 路径，通过 Body 结构区分：包含 <code>Messages</code> 数组即为批量发送，否则为单条发送。</li>
     * <li>批量操作的返回结果可能同时包含成功和失败的子消息。</li>
     * <li>每次请求中可以包含多个消息对象，每个消息对象可以设置不同的延迟时间和优先级。</li>
     * <li>对于 FIFO 队列，可以通过 <code>MessageGroupId</code> 参数来指定消息分组 ID。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量发送消息</p>
     * 
     * @param request BatchSendMessageRequest
     * @return BatchSendMessageResponse
     */
    public BatchSendMessageResponse batchSendMessage(String queueName, BatchSendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchSendMessageWithOptions(queueName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改消息下次可消费时间</p>
     * 
     * @param request ChangeMessageVisibilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeMessageVisibilityResponse
     */
    public ChangeMessageVisibilityResponse changeMessageVisibilityWithOptions(String queueName, ChangeMessageVisibilityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.receiptHandle)) {
            query.put("receiptHandle", request.receiptHandle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilityTimeout)) {
            query.put("visibilityTimeout", request.visibilityTimeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeMessageVisibility"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ChangeMessageVisibilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改消息下次可消费时间</p>
     * 
     * @param request ChangeMessageVisibilityRequest
     * @return ChangeMessageVisibilityResponse
     */
    public ChangeMessageVisibilityResponse changeMessageVisibility(String queueName, ChangeMessageVisibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeMessageVisibilityWithOptions(queueName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>消息发布后会被推送到该 Topic 下所有 Subscription 的 Endpoint。</li>
     * <li>推送到 Queue 和 HTTP Endpoint 时不需要设置 <code>MessageAttributes</code>。</li>
     * <li>推送到邮件、短信或移动推送时需要设置对应的 <code>MessageAttributes</code> 子属性。</li>
     * <li>消息内容建议事先进行 Base64 编码以避免特殊字符问题。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>发布消息</p>
     * 
     * @param request PublishMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishMessageResponse
     */
    public PublishMessageResponse publishMessageWithOptions(String topicName, PublishMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageAttributes)) {
            body.put("MessageAttributes", request.messageAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageBody)) {
            body.put("MessageBody", request.messageBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageGroupId)) {
            body.put("MessageGroupId", request.messageGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTag)) {
            body.put("MessageTag", request.messageTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/topics/" + topicName + "/messages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PublishMessageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>消息发布后会被推送到该 Topic 下所有 Subscription 的 Endpoint。</li>
     * <li>推送到 Queue 和 HTTP Endpoint 时不需要设置 <code>MessageAttributes</code>。</li>
     * <li>推送到邮件、短信或移动推送时需要设置对应的 <code>MessageAttributes</code> 子属性。</li>
     * <li>消息内容建议事先进行 Base64 编码以避免特殊字符问题。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>发布消息</p>
     * 
     * @param request PublishMessageRequest
     * @return PublishMessageResponse
     */
    public PublishMessageResponse publishMessage(String topicName, PublishMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishMessageWithOptions(topicName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>SendMessage</strong> 接口用于将消息发送至指定队列。</li>
     * <li>消息可以立即被消费或通过设置 <code>DelaySeconds</code> 参数来延迟消费。</li>
     * <li>发送的消息可以指定优先级，数值越小表示优先级越高。</li>
     * <li>对于 FIFO 队列，可以通过 <code>MessageGroupId</code> 来保证同一分组内消息的顺序投递。</li>
     * <li>用户还可以自定义属性 <code>UserProperties</code>，以 JSON 格式字符串形式提供额外信息。</li>
     * <li>当 <code>DelaySeconds</code> 大于 0 时，API 返回的 <code>ReceiptHandle</code> 可用来在消息变为 Active 状态前删除该延迟消息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>发送消息</p>
     * 
     * @param request SendMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessageWithOptions(String queueName, SendMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delaySeconds)) {
            body.put("DelaySeconds", request.delaySeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageBody)) {
            body.put("MessageBody", request.messageBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageGroupId)) {
            body.put("MessageGroupId", request.messageGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProperties)) {
            body.put("UserProperties", request.userProperties);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SendMessageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>SendMessage</strong> 接口用于将消息发送至指定队列。</li>
     * <li>消息可以立即被消费或通过设置 <code>DelaySeconds</code> 参数来延迟消费。</li>
     * <li>发送的消息可以指定优先级，数值越小表示优先级越高。</li>
     * <li>对于 FIFO 队列，可以通过 <code>MessageGroupId</code> 来保证同一分组内消息的顺序投递。</li>
     * <li>用户还可以自定义属性 <code>UserProperties</code>，以 JSON 格式字符串形式提供额外信息。</li>
     * <li>当 <code>DelaySeconds</code> 大于 0 时，API 返回的 <code>ReceiptHandle</code> 可用来在消息变为 Active 状态前删除该延迟消息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>发送消息</p>
     * 
     * @param request SendMessageRequest
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessage(String queueName, SendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendMessageWithOptions(queueName, request, headers, runtime);
    }
}
