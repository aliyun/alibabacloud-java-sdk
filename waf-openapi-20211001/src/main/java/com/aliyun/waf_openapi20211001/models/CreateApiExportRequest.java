// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateApiExportRequest extends TeaModel {
    /**
     * <p>The hybrid cloud cluster ID.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. You can call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain hybrid cloud cluster information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>993</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-zxu3***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The extended parameters of the export task. You can filter the exported content by specifying conditions. The value is a JSON string constructed from a series of parameters.</p>
     * <blockquote>
     * <p>The specific parameters vary depending on the specified <strong>export task type</strong> (<strong>Type</strong>). For more information, refer to <strong>Export task parameter description</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;startTime&quot;: 1741449600,
     *     &quot;endTime&quot;: 1744079820,
     *     &quot;sensitiveLevel&quot;: &quot;L1&quot;
     * }</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The language type. Valid values:</p>
     * <ul>
     * <li><strong>cn</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the export task. Valid values:</p>
     * <ul>
     * <li><p><strong>apisec_api</strong> (default): API asset task.</p>
     * </li>
     * <li><p><strong>apisec_abnormal</strong>: API risk task.</p>
     * </li>
     * <li><p><strong>apisec_event</strong>: API security event task.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>apisec_api</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The time zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateApiExportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiExportRequest self = new CreateApiExportRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiExportRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateApiExportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateApiExportRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CreateApiExportRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateApiExportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApiExportRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateApiExportRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateApiExportRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
