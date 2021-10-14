// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitDetailResponseBody extends TeaModel {
    @NameInMap("DataLimit")
    public DescribeDataLimitDetailResponseBodyDataLimit dataLimit;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataLimitDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitDetailResponseBody self = new DescribeDataLimitDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitDetailResponseBody setDataLimit(DescribeDataLimitDetailResponseBodyDataLimit dataLimit) {
        this.dataLimit = dataLimit;
        return this;
    }
    public DescribeDataLimitDetailResponseBodyDataLimit getDataLimit() {
        return this.dataLimit;
    }

    public DescribeDataLimitDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataLimitDetailResponseBodyDataLimit extends TeaModel {
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        @NameInMap("CheckStatusName")
        public String checkStatusName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceType")
        public Long resourceType;

        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        @NameInMap("UserName")
        public String userName;

        public static DescribeDataLimitDetailResponseBodyDataLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitDetailResponseBodyDataLimit self = new DescribeDataLimitDetailResponseBodyDataLimit();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setCheckStatus(Integer checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setCheckStatusName(String checkStatusName) {
            this.checkStatusName = checkStatusName;
            return this;
        }
        public String getCheckStatusName() {
            return this.checkStatusName;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public DescribeDataLimitDetailResponseBodyDataLimit setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
