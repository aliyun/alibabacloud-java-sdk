// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailProjectResponseBody extends TeaModel {
    // 业务ID
    @NameInMap("BusinessId")
    public Long businessId;

    // 业务名称
    @NameInMap("BusinessName")
    public String businessName;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 创建时间
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    // 最后修改时间
    @NameInMap("GmtModified")
    public Long gmtModified;

    // 项目ID
    @NameInMap("Id")
    public String id;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 项目名称
    @NameInMap("Name")
    public String name;

    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // Token
    @NameInMap("Token")
    public String token;

    public static DetailProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailProjectResponseBody self = new DetailProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailProjectResponseBody setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public DetailProjectResponseBody setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public DetailProjectResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DetailProjectResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DetailProjectResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DetailProjectResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DetailProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetailProjectResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailProjectResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
