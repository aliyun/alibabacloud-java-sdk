// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByPerformanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("proxyId")
    public String proxyId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("SortMethod")
    public String sortMethod;

    @NameInMap("SortKey")
    public String sortKey;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Tag")
    public java.util.List<DescribeDBInstancesByPerformanceRequestTag> tag;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDBInstancesByPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByPerformanceRequest self = new DescribeDBInstancesByPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByPerformanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDBInstancesByPerformanceRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public DescribeDBInstancesByPerformanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancesByPerformanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesByPerformanceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesByPerformanceRequest setSortMethod(String sortMethod) {
        this.sortMethod = sortMethod;
        return this;
    }
    public String getSortMethod() {
        return this.sortMethod;
    }

    public DescribeDBInstancesByPerformanceRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public DescribeDBInstancesByPerformanceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeDBInstancesByPerformanceRequest setTag(java.util.List<DescribeDBInstancesByPerformanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBInstancesByPerformanceRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDBInstancesByPerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeDBInstancesByPerformanceRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static DescribeDBInstancesByPerformanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByPerformanceRequestTag self = new DescribeDBInstancesByPerformanceRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByPerformanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesByPerformanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
