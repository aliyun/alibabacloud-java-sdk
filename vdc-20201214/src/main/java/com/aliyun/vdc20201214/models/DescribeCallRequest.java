// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallRequest extends TeaModel {
    // APP ID。
    @NameInMap("AppId")
    public String appId;

    // 频道ID。
    @NameInMap("ChannelId")
    public String channelId;

    // 创建频道时间，使用UNIX时间戳表示，单位：秒。
    @NameInMap("CreatedTs")
    public Long createdTs;

    // 频道释放时间，使用UNIX时间戳表示，单位：秒。参数为空表示获取当前时间。
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    // 查询的扩展。取值：USER_DURATION_STAT：用户时长统计数据类型。
    @NameInMap("ExtDataType")
    public String extDataType;

    // 是否查询通信体验信息，不传默认是true
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
