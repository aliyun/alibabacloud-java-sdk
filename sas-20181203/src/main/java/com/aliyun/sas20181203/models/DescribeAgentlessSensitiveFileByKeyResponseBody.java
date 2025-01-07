// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAgentlessSensitiveFileByKeyResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FBBEB173-1F43-505F-A876-C03ECDF6CE4C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the sensitive files that are detected by using the agentless detection feature.</p>
     */
    @NameInMap("SensitiveFileList")
    public java.util.List<DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList> sensitiveFileList;

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

    public static DescribeAgentlessSensitiveFileByKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentlessSensitiveFileByKeyResponseBody self = new DescribeAgentlessSensitiveFileByKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgentlessSensitiveFileByKeyResponseBody setPageInfo(DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAgentlessSensitiveFileByKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgentlessSensitiveFileByKeyResponseBody setSensitiveFileList(java.util.List<DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList> sensitiveFileList) {
        this.sensitiveFileList = sensitiveFileList;
        return this;
    }
    public java.util.List<DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList> getSensitiveFileList() {
        return this.sensitiveFileList;
    }

    public DescribeAgentlessSensitiveFileByKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
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
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo self = new DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The timestamp when the first scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663321552000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>test-server</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>95.214.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>10.68.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663691592000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The type of the sensitive file.</p>
         * 
         * <strong>example:</strong>
         * <p>pem</p>
         */
        @NameInMap("SensitiveFileKey")
        public String sensitiveFileKey;

        /**
         * <p>The status of the sensitive file. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled.</li>
         * <li><strong>1</strong>: ignored.</li>
         * <li><strong>2</strong>: false positive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>SAS_Agentless_171869952****</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>73e6a851-e63b-49ef-9d7a-5542d765****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList self = new DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList();
            return TeaModel.build(map, self);
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setSensitiveFileKey(String sensitiveFileKey) {
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }
        public String getSensitiveFileKey() {
            return this.sensitiveFileKey;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public DescribeAgentlessSensitiveFileByKeyResponseBodySensitiveFileList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
