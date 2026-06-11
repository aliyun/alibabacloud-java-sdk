// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointConnectionRequest extends TeaModel {
    /**
     * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
     * <blockquote>
     * <p>The valid values vary depending on the service resource type:</p>
     * <ul>
     * <li>NLB: 100 to 50000.</li>
     * <li>ALB: 100 to 25000.</li>
     * <li>CLB: 100 to 10240. Default value: 3072.</li>
     * <li>GWLB: 100 to 25000.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3072</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing required parameters, the request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the connection request is accepted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The region ID of the endpoint connection to be accepted.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The endpoint service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <ul>
     * <li><p>Scalability: automatic scaling. In this mode, the connection bandwidth configured for the endpoint connection does not take effect.</p>
     * </li>
     * <li><p>BandwidthLimit: supports setting a bandwidth upper limit for the endpoint connection. The bandwidth upper limit is the value of Bandwidth.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>When the service resource is NLB, TrafficControlMode is set to Scalability by default. You can set it to BandwidthLimit and modify the value of Bandwidth to provide a bandwidth upper limit.</li>
     * <li>When the service resource is CLB, TrafficControlMode can only be set to BandwidthLimit, which indicates that the service provider provides default bandwidth throttling for each endpoint.</li>
     * <li>When the service resource is GWLB, TrafficControlMode can only be set to Scalability.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BandwidthLimit</p>
     */
    @NameInMap("TrafficControlMode")
    public String trafficControlMode;

    public static EnableVpcEndpointConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcEndpointConnectionRequest self = new EnableVpcEndpointConnectionRequest();
        return TeaModel.build(map, self);
    }

    public EnableVpcEndpointConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public EnableVpcEndpointConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableVpcEndpointConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableVpcEndpointConnectionRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public EnableVpcEndpointConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableVpcEndpointConnectionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public EnableVpcEndpointConnectionRequest setTrafficControlMode(String trafficControlMode) {
        this.trafficControlMode = trafficControlMode;
        return this;
    }
    public String getTrafficControlMode() {
        return this.trafficControlMode;
    }

}
