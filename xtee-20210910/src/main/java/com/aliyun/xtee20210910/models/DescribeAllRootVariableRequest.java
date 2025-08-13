// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllRootVariableRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Request source IP. No need to fill in, the system will automatically obtain it.</p>
     * 
     * <strong>example:</strong>
     * <p>61.169.104.202</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Device variable list</p>
     * 
     * <strong>example:</strong>
     * <p>[180]</p>
     */
    @NameInMap("deviceVariableIds")
    public String deviceVariableIds;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_arqbuy7206</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Custom variable list</p>
     * 
     * <strong>example:</strong>
     * <p>[6780]</p>
     */
    @NameInMap("expressionVariableIds")
    public String expressionVariableIds;

    /**
     * <p>Variable ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2557</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Event field list</p>
     * 
     * <strong>example:</strong>
     * <p>[106780]</p>
     */
    @NameInMap("nativeVariableIds")
    public String nativeVariableIds;

    /**
     * <p>Custom query variable</p>
     * 
     * <strong>example:</strong>
     * <p>[2678]</p>
     */
    @NameInMap("queryVariableIds")
    public String queryVariableIds;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Custom cumulative variable</p>
     * 
     * <strong>example:</strong>
     * <p>[780]</p>
     */
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
