// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The information about the urgent vulnerabilities.</p>
     */
    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> groupedVulItems;

    /**
     * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BC1868ED-A0E1-4D1C-BF7E-10DC0C34B3C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the urgent vulnerabilities returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEmgVulItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgVulItemResponseBody self = new DescribeEmgVulItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmgVulItemResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEmgVulItemResponseBody setGroupedVulItems(java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public DescribeEmgVulItemResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEmgVulItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEmgVulItemResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEmgVulItemResponseBodyGroupedVulItems extends TeaModel {
        /**
         * <p>The name of the urgent vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>Changjietong T + SetupAccount/Upload.aspx file Upload vulnerability (CNVD-2022-60632)</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The check method.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>The timestamp when the urgent vulnerability was last detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1619286031000</p>
         */
        @NameInMap("GmtLastCheck")
        public Long gmtLastCheck;

        /**
         * <p>The timestamp when the vulnerability was disclosed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1618887687000</p>
         */
        @NameInMap("GmtPublish")
        public Long gmtPublish;

        /**
         * <p>The name of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>scan:AVD-2021-179344</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of unhandled urgent vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PendingCount")
        public Integer pendingCount;

        /**
         * <p>The progress of the urgent vulnerability detection task. Valid values: 0 to 100.</p>
         * <blockquote>
         * <p> This parameter takes effect only when an urgent vulnerability is being detected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>Indicates whether the application protection feature is supported. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is not returned, the application protection is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RaspDefend")
        public Integer raspDefend;

        /**
         * <p>The detection status of the urgent vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>10</strong>: The urgent vulnerability is not detected.</li>
         * <li><strong>20</strong>: The urgent vulnerability is being detected.</li>
         * <li><strong>30</strong>: The urgent vulnerability detection is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The method that is used to detect the urgent vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>python</strong>: The Version method is used. Security Center checks the software versions of your server to check whether disclosed vulnerabilities exist on your server.</li>
         * <li><strong>scan</strong>: The Network Scan method is used. Security Center analyzes the access traffic to your server over the Internet to check whether vulnerabilities exist on your server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scan</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeEmgVulItemResponseBodyGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmgVulItemResponseBodyGroupedVulItems self = new DescribeEmgVulItemResponseBodyGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setGmtLastCheck(Long gmtLastCheck) {
            this.gmtLastCheck = gmtLastCheck;
            return this;
        }
        public Long getGmtLastCheck() {
            return this.gmtLastCheck;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setGmtPublish(Long gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }
        public Long getGmtPublish() {
            return this.gmtPublish;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setPendingCount(Integer pendingCount) {
            this.pendingCount = pendingCount;
            return this;
        }
        public Integer getPendingCount() {
            return this.pendingCount;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setRaspDefend(Integer raspDefend) {
            this.raspDefend = raspDefend;
            return this;
        }
        public Integer getRaspDefend() {
            return this.raspDefend;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
