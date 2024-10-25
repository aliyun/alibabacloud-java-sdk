// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeActivationCodesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeActivationCodesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>65D7ACE6-4A61-4B6E-B357-8CB24A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeActivationCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationCodesResponseBody self = new DescribeActivationCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActivationCodesResponseBody setItems(java.util.List<DescribeActivationCodesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeActivationCodesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeActivationCodesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActivationCodesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeActivationCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActivationCodesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeActivationCodesResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        @NameInMap("ActivateAt")
        public String activateAt;

        /**
         * <strong>example:</strong>
         * <p>testCode</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2054-10-16 16:46:20</p>
         */
        @NameInMap("ExpireAt")
        public String expireAt;

        /**
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>12:34:56:78:98:00</p>
         */
        @NameInMap("MacAddress")
        public String macAddress;

        /**
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("SystemIdentifier")
        public String systemIdentifier;

        public static DescribeActivationCodesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeActivationCodesResponseBodyItems self = new DescribeActivationCodesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeActivationCodesResponseBodyItems setActivateAt(String activateAt) {
            this.activateAt = activateAt;
            return this;
        }
        public String getActivateAt() {
            return this.activateAt;
        }

        public DescribeActivationCodesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeActivationCodesResponseBodyItems setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public DescribeActivationCodesResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeActivationCodesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeActivationCodesResponseBodyItems setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeActivationCodesResponseBodyItems setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeActivationCodesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeActivationCodesResponseBodyItems setSystemIdentifier(String systemIdentifier) {
            this.systemIdentifier = systemIdentifier;
            return this;
        }
        public String getSystemIdentifier() {
            return this.systemIdentifier;
        }

    }

}
