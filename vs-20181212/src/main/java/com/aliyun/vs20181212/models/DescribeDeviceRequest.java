// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IncludeDirectory")
    public Boolean includeDirectory;

    @NameInMap("IncludeStats")
    public Boolean includeStats;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceRequest self = new DescribeDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDeviceRequest setIncludeDirectory(Boolean includeDirectory) {
        this.includeDirectory = includeDirectory;
        return this;
    }
    public Boolean getIncludeDirectory() {
        return this.includeDirectory;
    }

    public DescribeDeviceRequest setIncludeStats(Boolean includeStats) {
        this.includeStats = includeStats;
        return this;
    }
    public Boolean getIncludeStats() {
        return this.includeStats;
    }

    public DescribeDeviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
