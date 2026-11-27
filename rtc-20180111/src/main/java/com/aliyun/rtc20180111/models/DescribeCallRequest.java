// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallRequest extends TeaModel {
    /**
     * <p>The app ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testappid</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The channel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The time when the channel was created. You can query data of the last 30 days. The time is a UNIX timestamp in seconds.</p>
     * <blockquote>
     * <p>The channel creation time must be exactly the same as the actual creation time (accurate to the second). You can call the <a href="https://help.aliyun.com/document_detail/2655884.html">DescribeCallList</a> operation to view the channel creation time (the CreatedTS parameter in the response).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
     * <p>The time when the channel was released. The time is a UNIX timestamp in seconds. If this parameter is left empty, the current time is used.</p>
     * <blockquote>
     * <p>If the specified channel release time is later than the actual release time, the data from the creation time to the actual release time is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    /**
     * <p>The extended data type to query. Valid values:</p>
     * <ul>
     * <li>USER_DURATION_STAT: user duration statistics.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER_DURATION_STAT</p>
     */
    @NameInMap("ExtDataType")
    public String extDataType;

    /**
     * <p>Specifies whether to query the communication experience information. Default value: true.</p>
     * 
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
