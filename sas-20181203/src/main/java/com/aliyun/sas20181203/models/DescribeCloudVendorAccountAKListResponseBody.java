// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorAccountAKListResponseBody extends TeaModel {
    /**
     * <p>The information about the AccessKey pairs.</p>
     */
    @NameInMap("CloudVendorAccountAKs")
    public java.util.List<DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs> cloudVendorAccountAKs;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeCloudVendorAccountAKListResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudVendorAccountAKListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudVendorAccountAKListResponseBody self = new DescribeCloudVendorAccountAKListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudVendorAccountAKListResponseBody setCloudVendorAccountAKs(java.util.List<DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs> cloudVendorAccountAKs) {
        this.cloudVendorAccountAKs = cloudVendorAccountAKs;
        return this;
    }
    public java.util.List<DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs> getCloudVendorAccountAKs() {
        return this.cloudVendorAccountAKs;
    }

    public DescribeCloudVendorAccountAKListResponseBody setPageInfo(DescribeCloudVendorAccountAKListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeCloudVendorAccountAKListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeCloudVendorAccountAKListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules extends TeaModel {
        /**
         * <p>The error message of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_domain_error</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The code of the module. Valid values:</p>
         * <ul>
         * <li><strong>HOST</strong>: host</li>
         * <li><strong>CSPM</strong>: configuration assessment</li>
         * <li><strong>SIEM</strong>: CloudSiem</li>
         * <li><strong>TRIAL</strong>: log audit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOST</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The cloud asset that is associated with the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud server or virtual machine</p>
         */
        @NameInMap("ModuleAssetType")
        public String moduleAssetType;

        /**
         * <p>The display name of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Host Assets</p>
         */
        @NameInMap("ModuleDisp")
        public String moduleDisp;

        /**
         * <p>The service status of the module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: being used</li>
         * <li><strong>1</strong>: exception occurred</li>
         * <li><strong>2</strong>: being validated</li>
         * <li><strong>3</strong>: validation timed out</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ModuleServiceStatus")
        public Integer moduleServiceStatus;

        /**
         * <p>The permission description of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Read permission of the cloud server or virtual machine</p>
         */
        @NameInMap("ModuleStatement")
        public String moduleStatement;

        /**
         * <p>The error message of the log audit service.</p>
         * 
         * <strong>example:</strong>
         * <p>timeout</p>
         */
        @NameInMap("TrailMessage")
        public String trailMessage;

        /**
         * <p>The status of the log audit service. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: being initialized</li>
         * <li><strong>verify</strong>: being validated</li>
         * <li><strong>enable</strong>: enabled</li>
         * <li><strong>disable</strong>: disabled</li>
         * <li><strong>error</strong>: exception occurred</li>
         * <li><strong>timeout</strong>: validation timed out</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("TrailStatus")
        public String trailStatus;

        public static DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules self = new DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules();
            return TeaModel.build(map, self);
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules setModuleAssetType(String moduleAssetType) {
            this.moduleAssetType = moduleAssetType;
            return this;
        }
        public String getModuleAssetType() {
            return this.moduleAssetType;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules setModuleDisp(String moduleDisp) {
            this.moduleDisp = moduleDisp;
            return this;
        }
        public String getModuleDisp() {
            return this.moduleDisp;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules setModuleServiceStatus(Integer moduleServiceStatus) {
            this.moduleServiceStatus = moduleServiceStatus;
            return this;
        }
        public Integer getModuleServiceStatus() {
            return this.moduleServiceStatus;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules setModuleStatement(String moduleStatement) {
            this.moduleStatement = moduleStatement;
            return this;
        }
        public String getModuleStatement() {
            return this.moduleStatement;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules setTrailMessage(String trailMessage) {
            this.trailMessage = trailMessage;
            return this;
        }
        public String getTrailMessage() {
            return this.trailMessage;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules setTrailStatus(String trailStatus) {
            this.trailStatus = trailStatus;
            return this;
        }
        public String getTrailStatus() {
            return this.trailStatus;
        }

    }

    public static class DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs extends TeaModel {
        /**
         * <p>The type of the account to which the AccessKey pair belongs. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong>: a primary account</li>
         * <li><strong>sub</strong>: a sub-account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("AkType")
        public String akType;

        /**
         * <p>The unique ID of the AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("AuthId")
        public Long authId;

        /**
         * <p>The modules that are associated with the AccessKey pair.</p>
         */
        @NameInMap("AuthModules")
        public java.util.List<DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules> authModules;

        /**
         * <p>The error message of the AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>The IAM user is forbidden in the currently selected region</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S3D6c4O***</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>The service status of the AccessKey pair. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: being used</li>
         * <li><strong>1</strong>: exception occurred</li>
         * <li><strong>2</strong>: being validated</li>
         * <li><strong>3</strong>: validation timed out</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        /**
         * <p>The status of the AccessKey pair. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: enabled</li>
         * <li><strong>1</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The cloud service provider. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
         * <li><strong>Azure</strong>: Microsoft Azure</li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("VendorAuthAlias")
        public String vendorAuthAlias;

        public static DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs self = new DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs();
            return TeaModel.build(map, self);
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setAkType(String akType) {
            this.akType = akType;
            return this;
        }
        public String getAkType() {
            return this.akType;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setAuthId(Long authId) {
            this.authId = authId;
            return this;
        }
        public Long getAuthId() {
            return this.authId;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setAuthModules(java.util.List<DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules> authModules) {
            this.authModules = authModules;
            return this;
        }
        public java.util.List<DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKsAuthModules> getAuthModules() {
            return this.authModules;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeCloudVendorAccountAKListResponseBodyCloudVendorAccountAKs setVendorAuthAlias(String vendorAuthAlias) {
            this.vendorAuthAlias = vendorAuthAlias;
            return this;
        }
        public String getVendorAuthAlias() {
            return this.vendorAuthAlias;
        }

    }

    public static class DescribeCloudVendorAccountAKListResponseBodyPageInfo extends TeaModel {
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
         * <p>55</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeCloudVendorAccountAKListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudVendorAccountAKListResponseBodyPageInfo self = new DescribeCloudVendorAccountAKListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCloudVendorAccountAKListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeCloudVendorAccountAKListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCloudVendorAccountAKListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCloudVendorAccountAKListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
