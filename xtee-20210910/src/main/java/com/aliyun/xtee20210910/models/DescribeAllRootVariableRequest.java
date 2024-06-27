// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllRootVariableRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("deviceVariableIds")
    public String deviceVariableIds;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("expressionVariableIds")
    public String expressionVariableIds;

    @NameInMap("id")
    public Long id;

    @NameInMap("nativeVariableIds")
    public String nativeVariableIds;

    @NameInMap("queryVariableIds")
    public String queryVariableIds;

    @NameInMap("regId")
    public String regId;

    @NameInMap("velocityVariableIds")
    public String velocityVariableIds;

    public static DescribeAllRootVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllRootVariableRequest self = new DescribeAllRootVariableRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllRootVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAllRootVariableRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAllRootVariableRequest setDeviceVariableIds(String deviceVariableIds) {
        this.deviceVariableIds = deviceVariableIds;
        return this;
    }
    public String getDeviceVariableIds() {
        return this.deviceVariableIds;
    }

    public DescribeAllRootVariableRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeAllRootVariableRequest setExpressionVariableIds(String expressionVariableIds) {
        this.expressionVariableIds = expressionVariableIds;
        return this;
    }
    public String getExpressionVariableIds() {
        return this.expressionVariableIds;
    }

    public DescribeAllRootVariableRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeAllRootVariableRequest setNativeVariableIds(String nativeVariableIds) {
        this.nativeVariableIds = nativeVariableIds;
        return this;
    }
    public String getNativeVariableIds() {
        return this.nativeVariableIds;
    }

    public DescribeAllRootVariableRequest setQueryVariableIds(String queryVariableIds) {
        this.queryVariableIds = queryVariableIds;
        return this;
    }
    public String getQueryVariableIds() {
        return this.queryVariableIds;
    }

    public DescribeAllRootVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeAllRootVariableRequest setVelocityVariableIds(String velocityVariableIds) {
        this.velocityVariableIds = velocityVariableIds;
        return this;
    }
    public String getVelocityVariableIds() {
        return this.velocityVariableIds;
    }

}
