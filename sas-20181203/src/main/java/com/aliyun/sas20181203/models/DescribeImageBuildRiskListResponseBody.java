// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBuildRiskListResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeImageBuildRiskListResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageBuildRiskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBuildRiskListResponseBody self = new DescribeImageBuildRiskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageBuildRiskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageBuildRiskListResponseBody setData(DescribeImageBuildRiskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageBuildRiskListResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageBuildRiskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageBuildRiskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageBuildRiskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageBuildRiskListResponseBodyDataList extends TeaModel {
        /**
         * <p>The number of affected images.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1723710827000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1723710827999</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The type key of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("RiskClass")
        public String riskClass;

        /**
         * <p>The type name of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("RiskClassName")
        public String riskClassName;

        /**
         * <p>The key of the risk. You can call the <a href="~~~~">DescribeImageBuildRiskList</a> operation to obtain the value of <strong>RiskKey</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>no_user</p>
         */
        @NameInMap("RiskKey")
        public String riskKey;

        /**
         * <p>The rule name of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>no_user</p>
         */
        @NameInMap("RiskKeyName")
        public String riskKeyName;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The number of unprocessed images.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnprocessedNum")
        public Integer unprocessedNum;

        public static DescribeImageBuildRiskListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBuildRiskListResponseBodyDataList self = new DescribeImageBuildRiskListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeImageBuildRiskListResponseBodyDataList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageBuildRiskListResponseBodyDataList setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public DescribeImageBuildRiskListResponseBodyDataList setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageBuildRiskListResponseBodyDataList setRiskClass(String riskClass) {
            this.riskClass = riskClass;
            return this;
        }
        public String getRiskClass() {
            return this.riskClass;
        }

        public DescribeImageBuildRiskListResponseBodyDataList setRiskClassName(String riskClassName) {
            this.riskClassName = riskClassName;
            return this;
        }
        public String getRiskClassName() {
            return this.riskClassName;
        }

        public DescribeImageBuildRiskListResponseBodyDataList setRiskKey(String riskKey) {
            this.riskKey = riskKey;
            return this;
        }
        public String getRiskKey() {
            return this.riskKey;
        }

        public DescribeImageBuildRiskListResponseBodyDataList setRiskKeyName(String riskKeyName) {
            this.riskKeyName = riskKeyName;
            return this;
        }
        public String getRiskKeyName() {
            return this.riskKeyName;
        }

        public DescribeImageBuildRiskListResponseBodyDataList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeImageBuildRiskListResponseBodyDataList setUnprocessedNum(Integer unprocessedNum) {
            this.unprocessedNum = unprocessedNum;
            return this;
        }
        public Integer getUnprocessedNum() {
            return this.unprocessedNum;
        }

    }

    public static class DescribeImageBuildRiskListResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>109</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageBuildRiskListResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBuildRiskListResponseBodyDataPageInfo self = new DescribeImageBuildRiskListResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageBuildRiskListResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageBuildRiskListResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageBuildRiskListResponseBodyDataPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeImageBuildRiskListResponseBodyData extends TeaModel {
        /**
         * <p>The risks.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeImageBuildRiskListResponseBodyDataList> list;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeImageBuildRiskListResponseBodyDataPageInfo pageInfo;

        public static DescribeImageBuildRiskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBuildRiskListResponseBodyData self = new DescribeImageBuildRiskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageBuildRiskListResponseBodyData setList(java.util.List<DescribeImageBuildRiskListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeImageBuildRiskListResponseBodyDataList> getList() {
            return this.list;
        }

        public DescribeImageBuildRiskListResponseBodyData setPageInfo(DescribeImageBuildRiskListResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeImageBuildRiskListResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
