// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListByBuildRiskResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
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
    public DescribeImageListByBuildRiskResponseBodyData data;

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
     * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
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

    public static DescribeImageListByBuildRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListByBuildRiskResponseBody self = new DescribeImageListByBuildRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageListByBuildRiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageListByBuildRiskResponseBody setData(DescribeImageListByBuildRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageListByBuildRiskResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageListByBuildRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageListByBuildRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageListByBuildRiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageListByBuildRiskResponseBodyDataList extends TeaModel {
        /**
         * <p>The digest value of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>a5ccdd9b166b67e02954aa9b618fe19b7968bd56a15463d2ad7f2643ba5b****</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1723710827000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The instance ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>39010****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1723710827999</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test-tepo</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

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
         * <p>The status of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled.</li>
         * <li><strong>1</strong>: ignored.</li>
         * <li><strong>2</strong>: false positive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>6ec898e6274f942e0e4a053eff1c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeImageListByBuildRiskResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListByBuildRiskResponseBodyDataList self = new DescribeImageListByBuildRiskResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeImageListByBuildRiskResponseBodyDataList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeImageListByBuildRiskResponseBodyDataPageInfo extends TeaModel {
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

        public static DescribeImageListByBuildRiskResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListByBuildRiskResponseBodyDataPageInfo self = new DescribeImageListByBuildRiskResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageListByBuildRiskResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageListByBuildRiskResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageListByBuildRiskResponseBodyDataPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeImageListByBuildRiskResponseBodyData extends TeaModel {
        /**
         * <p>The images.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeImageListByBuildRiskResponseBodyDataList> list;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeImageListByBuildRiskResponseBodyDataPageInfo pageInfo;

        public static DescribeImageListByBuildRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageListByBuildRiskResponseBodyData self = new DescribeImageListByBuildRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageListByBuildRiskResponseBodyData setList(java.util.List<DescribeImageListByBuildRiskResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeImageListByBuildRiskResponseBodyDataList> getList() {
            return this.list;
        }

        public DescribeImageListByBuildRiskResponseBodyData setPageInfo(DescribeImageListByBuildRiskResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeImageListByBuildRiskResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
