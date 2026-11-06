// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarFsRequest extends TeaModel {
    /**
     * <p>The size of the acceleration space. Unit: GB. The value must be no less than 5000 and must be a multiple of 1000. This parameter is required when acceleration is enabled for the Basic Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("AccelerateStorageSize")
    public Long accelerateStorageSize;

    /**
     * <p>The acceleration startup mode. Valid values:</p>
     * <ul>
     * <li><strong>ONLY</strong>: enables acceleration only.</li>
     * <li><strong>ON</strong>: enables cold data and acceleration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ONLY</p>
     */
    @NameInMap("AccelerateSwitch")
    public String accelerateSwitch;

    /**
     * <p>The acceleration type. Valid values: </p>
     * <ul>
     * <li><strong>juice</strong>: file system acceleration.</li>
     * <li><strong>alluxio</strong>: transparent acceleration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alluxio</p>
     */
    @NameInMap("AccelerateType")
    public String accelerateType;

    /**
     * <p>The list of authorized accounts for the Cold Storage Edition instance, separated by commas (<code>,</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>128***********，198***********</p>
     */
    @NameInMap("AuthorizedUserIds")
    public String authorizedUserIds;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>PayType</strong> parameter is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to automatically use coupons. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: uses coupons. This is the default value.</li>
     * <li><strong>false</strong>: does not use coupons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The edition. Valid values: basic (Basic Edition, default), high_performance (High-performance Edition), and cold (Cold Storage Edition). For the basic edition, you must specify AccelerateSwitch and AccelerateStorageSize. For the high_performance edition, you must specify StorageType (essdpl0 or essdpl1). For the cold edition, StorageType (local_redundancy or city_redundancy) is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("CreationCategory")
    public String creationCategory;

    /**
     * <p>The number of buckets.</p>
     * <blockquote>
     * <p>This parameter is required only when acceleration (file system acceleration) is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomBucketCount")
    public Integer customBucketCount;

    /**
     * <p>The bucket path.</p>
     * <blockquote>
     * <p>This parameter is required only when acceleration (file system acceleration) is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("CustomBucketPath")
    public String customBucketPath;

    /**
     * <p>The bucket and corresponding path information.</p>
     * <blockquote>
     * <p>This parameter is required for transparent acceleration.</p>
     * </blockquote>
     */
    @NameInMap("CustomBucketPathList")
    public java.util.List<CreatePolarFsRequestCustomBucketPathList> customBucketPathList;

    /**
     * <p>The custom AccessKey ID.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAIExampleCustomOssKeyId</p>
     */
    @NameInMap("CustomOssAk")
    public String customOssAk;

    /**
     * <p>The custom AccessKey secret.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleCustomOssSecret123</p>
     */
    @NameInMap("CustomOssSk")
    public String customOssSk;

    /**
     * <p>The PolarDB cluster ID. This parameter is required when you call this operation. If this parameter is not specified, the InvalidDBClusterId.Malformed error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database ecosystem. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The billing method. Valid values: </p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * <li><strong>Prepaid</strong>: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>If the <strong>PayType</strong> parameter is set to <strong>Prepaid</strong>, this parameter is required. Specifies the billing cycle of the upfront cluster. Valid values: </p>
     * <ul>
     * <li><strong>Year</strong>: year.</li>
     * <li><strong>Month</strong>: month.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The coupon code. If this parameter is not specified, the default coupon is used.</p>
     * 
     * <strong>example:</strong>
     * <p>727xxxxxx934</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The storage space. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>The storage type. For the high_performance edition, use lowercase essdpl0 or essdpl1. For the cold edition, use local_redundancy or city_redundancy. Select the value based on the edition. The value is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>local_redundancy</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>This parameter is required when the <strong>PayType</strong> parameter is set to <strong>Prepaid</strong>.</p>
     * <ul>
     * <li>If the <strong>Period</strong> parameter is set to <strong>Month</strong>, the value of <strong>UsedTime</strong> must be an integer in the range of <code>[1-9]</code>.</li>
     * <li>If the <strong>Period</strong> parameter is set to <strong>Year</strong>, the value of <strong>UsedTime</strong> must be an integer in the range of <code>[1-3]</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreatePolarFsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarFsRequest self = new CreatePolarFsRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarFsRequest setAccelerateStorageSize(Long accelerateStorageSize) {
        this.accelerateStorageSize = accelerateStorageSize;
        return this;
    }
    public Long getAccelerateStorageSize() {
        return this.accelerateStorageSize;
    }

    public CreatePolarFsRequest setAccelerateSwitch(String accelerateSwitch) {
        this.accelerateSwitch = accelerateSwitch;
        return this;
    }
    public String getAccelerateSwitch() {
        return this.accelerateSwitch;
    }

    public CreatePolarFsRequest setAccelerateType(String accelerateType) {
        this.accelerateType = accelerateType;
        return this;
    }
    public String getAccelerateType() {
        return this.accelerateType;
    }

    public CreatePolarFsRequest setAuthorizedUserIds(String authorizedUserIds) {
        this.authorizedUserIds = authorizedUserIds;
        return this;
    }
    public String getAuthorizedUserIds() {
        return this.authorizedUserIds;
    }

    public CreatePolarFsRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreatePolarFsRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreatePolarFsRequest setCreationCategory(String creationCategory) {
        this.creationCategory = creationCategory;
        return this;
    }
    public String getCreationCategory() {
        return this.creationCategory;
    }

    public CreatePolarFsRequest setCustomBucketCount(Integer customBucketCount) {
        this.customBucketCount = customBucketCount;
        return this;
    }
    public Integer getCustomBucketCount() {
        return this.customBucketCount;
    }

    public CreatePolarFsRequest setCustomBucketPath(String customBucketPath) {
        this.customBucketPath = customBucketPath;
        return this;
    }
    public String getCustomBucketPath() {
        return this.customBucketPath;
    }

    public CreatePolarFsRequest setCustomBucketPathList(java.util.List<CreatePolarFsRequestCustomBucketPathList> customBucketPathList) {
        this.customBucketPathList = customBucketPathList;
        return this;
    }
    public java.util.List<CreatePolarFsRequestCustomBucketPathList> getCustomBucketPathList() {
        return this.customBucketPathList;
    }

    public CreatePolarFsRequest setCustomOssAk(String customOssAk) {
        this.customOssAk = customOssAk;
        return this;
    }
    public String getCustomOssAk() {
        return this.customOssAk;
    }

    public CreatePolarFsRequest setCustomOssSk(String customOssSk) {
        this.customOssSk = customOssSk;
        return this;
    }
    public String getCustomOssSk() {
        return this.customOssSk;
    }

    public CreatePolarFsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreatePolarFsRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public CreatePolarFsRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreatePolarFsRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreatePolarFsRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public CreatePolarFsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolarFsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePolarFsRequest setStorageSpace(Long storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    public CreatePolarFsRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreatePolarFsRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreatePolarFsRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreatePolarFsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreatePolarFsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreatePolarFsRequestCustomBucketPathList extends TeaModel {
        /**
         * <p>The custom storage bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx.oss-[regionId]-internal.aliyuncs.com</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The custom storage path.</p>
         * 
         * <strong>example:</strong>
         * <p>/data</p>
         */
        @NameInMap("Path")
        public String path;

        public static CreatePolarFsRequestCustomBucketPathList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarFsRequestCustomBucketPathList self = new CreatePolarFsRequestCustomBucketPathList();
            return TeaModel.build(map, self);
        }

        public CreatePolarFsRequestCustomBucketPathList setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreatePolarFsRequestCustomBucketPathList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
