// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeTagsRequest extends TeaModel {
    // description: 用于保证请求的幂等性，防止重复提交请求。由客户端生成该参数值，要保证在不同请求间唯一，最大值不超过64个ASCII字符，且该参数值中不能包含非ASCII字符。; 
    @NameInMap("ClientToken")
    public String clientToken;

    // description: 代理模式ID。; 
    @NameInMap("proxyId")
    public String proxyId;

    // description: 地域ID，可以通过接口[DescribeRegions](~~26243~~)查看可用的地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 实例ID。>传入该参数，其他过滤条件失效。; 
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // description: 需要查询的标签，包括TagKey和TagValue。格式：{“key1”:”value1”}。; 
    @NameInMap("Tags")
    public String tags;

    public static DescribeTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsRequest self = new DescribeTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeTagsRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public DescribeTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTagsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeTagsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
