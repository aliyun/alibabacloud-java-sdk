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
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "mns.cn-hangzhou.aliyuncs.com")
        );
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
     * <b>summary</b> : 
     * <p>删除已消费消息</p>
     * 
     * @param request DeleteMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMessageResponse
     */
    public DeleteMessageResponse deleteMessageWithOptions(String queueName, DeleteMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.receiptHandle)) {
            query.put("ReceiptHandle", request.receiptHandle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除已消费消息</p>
     * 
     * @param request DeleteMessageRequest
     * @return DeleteMessageResponse
     */
    public DeleteMessageResponse deleteMessage(String queueName, DeleteMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMessageWithOptions(queueName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看消息</p>
     * 
     * @param request PeekMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PeekMessageResponse
     */
    public PeekMessageResponse peekMessageWithOptions(String queueName, PeekMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.peekonly)) {
            query.put("peekonly", request.peekonly);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PeekMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PeekMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看消息</p>
     * 
     * @param request PeekMessageRequest
     * @return PeekMessageResponse
     */
    public PeekMessageResponse peekMessage(String queueName, PeekMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.peekMessageWithOptions(queueName, request, headers, runtime);
    }

    /**
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
     * <b>summary</b> : 
     * <p>消费消息</p>
     * 
     * @param request ReceiveMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReceiveMessageResponse
     */
    public ReceiveMessageResponse receiveMessageWithOptions(String queueName, ReceiveMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.waitseconds)) {
            query.put("waitseconds", request.waitseconds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReceiveMessage"),
            new TeaPair("version", "2026-04-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queues/" + queueName + "/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ReceiveMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>消费消息</p>
     * 
     * @param request ReceiveMessageRequest
     * @return ReceiveMessageResponse
     */
    public ReceiveMessageResponse receiveMessage(String queueName, ReceiveMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveMessageWithOptions(queueName, request, headers, runtime);
    }

    /**
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
