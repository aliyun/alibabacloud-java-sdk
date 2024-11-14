// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateApiExportRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>For hybrid cloud scenarios only, you can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the hybrid cloud clusters.</p>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-zxu3***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The extended parameters of the data export task. The parameter value is in the JSON format. The following keys are supported:</p>
     * <ul>
     * <li><strong>instanceId</strong>: the instance ID</li>
     * <li><strong>clusterId</strong>: the ID of the hybrid cloud cluster</li>
     * <li><strong>orderKey</strong>: the name of the field used to sort exported data</li>
     * <li><strong>orderWay</strong>: the sorting method of the exported data</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;orderWay&quot;: &quot;asc&quot;,
     *     &quot;orderKey&quot;: &quot;endTs&quot;,
     *     &quot;instanceId&quot;: &quot;waf_v3prepaid_public_cn-****&quot;
     * }</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn</strong> (default): Chinese mainland.</li>
     * <li><strong>cn-hongkong</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the data export task. Valid values:</p>
     * <ul>
     * <li><strong>apisec_api</strong>: API tasks</li>
     * <li><strong>apisec_abnormal</strong>: API risk tasks</li>
     * <li><strong>apisec_event</strong>: API security event tasks</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>apisec_api</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the time zone.</p>
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
