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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Use this operation together with BatchReceiveMessage.</li>
     * <li>The result of a batch operation may contain both successful and failed sub-requests. The HTTP status code is 204 only when all sub-requests succeed.</li>
     * <li>A maximum of 16 messages can be deleted per request.</li>
     * <li>Provide the list of <code>ReceiptHandle</code> values returned from the previous consumption to identify the messages to delete.</li>
     * <li>This operation succeeds only when executed before <code>NextVisibleTime</code>. After the timeout, the message becomes Active again, the ReceiptHandle becomes invalid, and you must consume the message again to obtain a new handle.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes messages from a queue in a batch. A maximum of 16 messages can be deleted at a time.</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Use this operation together with BatchReceiveMessage.</li>
     * <li>The result of a batch operation may contain both successful and failed sub-requests. The HTTP status code is 204 only when all sub-requests succeed.</li>
     * <li>A maximum of 16 messages can be deleted per request.</li>
     * <li>Provide the list of <code>ReceiptHandle</code> values returned from the previous consumption to identify the messages to delete.</li>
     * <li>This operation succeeds only when executed before <code>NextVisibleTime</code>. After the timeout, the message becomes Active again, the ReceiptHandle becomes invalid, and you must consume the message again to obtain a new handle.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes messages from a queue in a batch. A maximum of 16 messages can be deleted at a time.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation batch peeks at messages in a specified queue. You can peek at up to 16 messages at a time.</li>
     * <li>This operation does not change the message status. Messages remain in the Active state.</li>
     * <li>Long polling is not supported.</li>
     * <li>Provide <code>queueName</code> as a path parameter, and set the query parameter <code>peekonly=true</code> along with <code>numOfMessages</code> (range: 1 to 16) to specify the number of messages to peek at.</li>
     * <li>A successful response returns an array containing the details of the requested messages, including but not limited to the message ID, body, and enqueue time.</li>
     * <li>If the specified queue does not exist or no visible messages are in the queue, the corresponding error code is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Batch peeks at messages in a queue without changing the message status.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation batch peeks at messages in a specified queue. You can peek at up to 16 messages at a time.</li>
     * <li>This operation does not change the message status. Messages remain in the Active state.</li>
     * <li>Long polling is not supported.</li>
     * <li>Provide <code>queueName</code> as a path parameter, and set the query parameter <code>peekonly=true</code> along with <code>numOfMessages</code> (range: 1 to 16) to specify the number of messages to peek at.</li>
     * <li>A successful response returns an array containing the details of the requested messages, including but not limited to the message ID, body, and enqueue time.</li>
     * <li>If the specified queue does not exist or no visible messages are in the queue, the corresponding error code is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Batch peeks at messages in a queue without changing the message status.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation changes the status of received messages to Inactive. The Inactive duration is determined by the <code>VisibilityTimeout</code> attribute of the queue.</li>
     * <li>Consumers must call DeleteMessage to delete messages within the VisibilityTimeout period. Otherwise, messages become Active again.</li>
     * <li>Long polling is supported: if you set <code>waitseconds &gt; 0</code> and the queue is empty, the request waits until a message arrives or the timeout expires.<blockquote>
     * <p>Notice: After long polling is enabled, reduce the concurrency of external long polling calls and select an appropriate long polling duration. The server dynamically adjusts the concurrency limit for long polling based on factors such as the number of long polling requests, long polling wait time, and number of access IP addresses. When the queue has no messages, requests that exceed the long polling limit cannot be listened to and directly return 404 MessageNotExist (billed normally by request count). If you need to temporarily increase the long polling limit, submit a ticket promptly.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Batch receives up to 16 messages from a specified queue for consumption.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation changes the status of received messages to Inactive. The Inactive duration is determined by the <code>VisibilityTimeout</code> attribute of the queue.</li>
     * <li>Consumers must call DeleteMessage to delete messages within the VisibilityTimeout period. Otherwise, messages become Active again.</li>
     * <li>Long polling is supported: if you set <code>waitseconds &gt; 0</code> and the queue is empty, the request waits until a message arrives or the timeout expires.<blockquote>
     * <p>Notice: After long polling is enabled, reduce the concurrency of external long polling calls and select an appropriate long polling duration. The server dynamically adjusts the concurrency limit for long polling based on factors such as the number of long polling requests, long polling wait time, and number of access IP addresses. When the queue has no messages, requests that exceed the long polling limit cannot be listened to and directly return 404 MessageNotExist (billed normally by request count). If you need to temporarily increase the long polling limit, submit a ticket promptly.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Batch receives up to 16 messages from a specified queue for consumption.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>The total size of messages in a single batch request must not exceed 64 KB.</li>
     * <li><code>BatchSendMessage</code> and <code>SendMessage</code> use the same URL path. They are distinguished by the body structure: if the body contains a <code>Messages</code> array, it is a batch send operation. Otherwise, it is a single message send operation.</li>
     * <li>The response of a batch operation may contain both successful and failed sub-messages.</li>
     * <li>Each request can contain multiple message objects. Each message object can have a different delay time and priority.</li>
     * <li>For FIFO queues, you can use the <code>MessageGroupId</code> parameter to specify a message group ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a batch of up to 16 messages to a specified queue, with a total size not exceeding 64 KB.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>The total size of messages in a single batch request must not exceed 64 KB.</li>
     * <li><code>BatchSendMessage</code> and <code>SendMessage</code> use the same URL path. They are distinguished by the body structure: if the body contains a <code>Messages</code> array, it is a batch send operation. Otherwise, it is a single message send operation.</li>
     * <li>The response of a batch operation may contain both successful and failed sub-messages.</li>
     * <li>Each request can contain multiple message objects. Each message object can have a different delay time and priority.</li>
     * <li>For FIFO queues, you can use the <code>MessageGroupId</code> parameter to specify a message group ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a batch of up to 16 messages to a specified queue, with a total size not exceeding 64 KB.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the VisibilityTimeout of a message that has been consumed and is currently in the Inactive state. The VisibilityTimeout is the countdown from the current moment until the message becomes Active again.</li>
     * <li>A successful invocation returns a new <code>ReceiptHandle</code>. Use this new handle for subsequent delete or visibility timeout modification operations on this message.</li>
     * <li>This operation can only be invoked successfully before <code>NextVisibleTime</code>. Otherwise, a fault is returned.</li>
     * <li>Common scenarios include when a consumer requires a longer processing time and needs to extend the VisibilityTimeout to prevent the message from being consumed again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Extends or shortens the invisibility period of a message that is in the Inactive state.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the VisibilityTimeout of a message that has been consumed and is currently in the Inactive state. The VisibilityTimeout is the countdown from the current moment until the message becomes Active again.</li>
     * <li>A successful invocation returns a new <code>ReceiptHandle</code>. Use this new handle for subsequent delete or visibility timeout modification operations on this message.</li>
     * <li>This operation can only be invoked successfully before <code>NextVisibleTime</code>. Otherwise, a fault is returned.</li>
     * <li>Common scenarios include when a consumer requires a longer processing time and needs to extend the VisibilityTimeout to prevent the message from being consumed again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Extends or shortens the invisibility period of a message that is in the Inactive state.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>After a message is published, it is pushed to the endpoints of all subscriptions under the topic.</li>
     * <li>You do not need to set <code>MessageAttributes</code> when pushing messages to queues or HTTP endpoints.</li>
     * <li>You must set the corresponding <code>MessageAttributes</code> sub-properties when pushing messages to email, SMS, or mobile push endpoints.</li>
     * <li>Base64-encode the message content beforehand to avoid special character issues.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Publishes a message to a specified topic. The message is pushed to all subscribed endpoints.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>After a message is published, it is pushed to the endpoints of all subscriptions under the topic.</li>
     * <li>You do not need to set <code>MessageAttributes</code> when pushing messages to queues or HTTP endpoints.</li>
     * <li>You must set the corresponding <code>MessageAttributes</code> sub-properties when pushing messages to email, SMS, or mobile push endpoints.</li>
     * <li>Base64-encode the message content beforehand to avoid special character issues.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Publishes a message to a specified topic. The message is pushed to all subscribed endpoints.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>The <strong>SendMessage</strong> operation sends a message to a specified queue.</li>
     * <li>Messages can be consumed immediately or delayed by setting the <code>DelaySeconds</code> parameter.</li>
     * <li>You can specify a priority for the message. A smaller value indicates a higher priority.</li>
     * <li>For FIFO queues, use <code>MessageGroupId</code> to ensure ordered delivery of messages within the same group.</li>
     * <li>You can also set custom attributes in <code>UserProperties</code> as a JSON-formatted string to provide additional information.</li>
     * <li>When <code>DelaySeconds</code> is greater than 0, the <code>ReceiptHandle</code> returned by the API can be used to delete the delayed message before it becomes Active.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a message to a specified queue with support for delay and priority settings.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>The <strong>SendMessage</strong> operation sends a message to a specified queue.</li>
     * <li>Messages can be consumed immediately or delayed by setting the <code>DelaySeconds</code> parameter.</li>
     * <li>You can specify a priority for the message. A smaller value indicates a higher priority.</li>
     * <li>For FIFO queues, use <code>MessageGroupId</code> to ensure ordered delivery of messages within the same group.</li>
     * <li>You can also set custom attributes in <code>UserProperties</code> as a JSON-formatted string to provide additional information.</li>
     * <li>When <code>DelaySeconds</code> is greater than 0, the <code>ReceiptHandle</code> returned by the API can be used to delete the delayed message before it becomes Active.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a message to a specified queue with support for delay and priority settings.</p>
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
