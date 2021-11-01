// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetOssPolicyResponseBody extends TeaModel {
    // accessId
    @NameInMap("AccessId")
    public String accessId;

    // 上传回调
    @NameInMap("Callback")
    public String callback;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 授权路径
    @NameInMap("Dir")
    public String dir;

    // 授权失效时间(s)
    @NameInMap("Expire")
    public String expire;

    // 上传地址
    @NameInMap("Host")
    public String host;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 授权
    @NameInMap("Policy")
    public String policy;

    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 签名
    @NameInMap("Signature")
    public String signature;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static GetOssPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssPolicyResponseBody self = new GetOssPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssPolicyResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetOssPolicyResponseBody setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public GetOssPolicyResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetOssPolicyResponseBody setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public GetOssPolicyResponseBody setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public GetOssPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetOssPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOssPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetOssPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetOssPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
