// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testappid</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    /**
     * <strong>example:</strong>
     * <p>USER_DURATION_STAT</p>
     */
    @NameInMap("ExtDataType")
    public String extDataType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryExpInfo")
    public Boolean queryExpInfo;

    public static DescribeCallRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallRequest self = new DescribeCallRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCallRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeCallRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeCallRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeCallRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribeCallRequest setExtDataType(String extDataType) {
        this.extDataType = extDataType;
        return this;
    }
    public String getExtDataType() {
        return this.extDataType;
    }

    public DescribeCallRequest setQueryExpInfo(Boolean queryExpInfo) {
        this.queryExpInfo = queryExpInfo;
        return this;
    }
    public Boolean getQueryExpInfo() {
        return this.queryExpInfo;
    }

}
