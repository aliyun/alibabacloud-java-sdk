// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcGatewayEndpointAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-27T01:58:37Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the gateway endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The ID of the gateway endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>vpce-bp1w1dmdqjpwul0v3****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The name of the gateway endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The status of the gateway endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong></li>
     * <li><strong>Created</strong></li>
     * <li><strong>Modifying</strong></li>
     * <li><strong>Associating</strong></li>
     * <li><strong>Dissociating</strong></li>
     * <li><strong>Deleting</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("EndpointStatus")
    public String endpointStatus;

    /**
     * <p>The access policy for the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot; : &quot;1&quot;,   &quot;Statement&quot; : [ {     &quot;Effect&quot; : &quot;Allow&quot;,     &quot;Resource&quot; : [ &quot;<em>&quot; ],     &quot;Action&quot; : [ &quot;</em>&quot; ],     &quot;Principal&quot; : [ &quot;*&quot; ]   } ] }</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1122D0F-7B3B-5445-BB19-17F27F97FE1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the gateway endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxvfvazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the route table associated with the gateway endpoint.</p>
     */
    @NameInMap("RouteTables")
    public java.util.List<String> routeTables;

    /**
     * <p>The name of the endpoint service.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliyun.cn-hangzhou.oss</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetVpcGatewayEndpointAttributeResponseBodyTags> tags;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the gateway endpoint belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nh86rugg01zol0****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static GetVpcGatewayEndpointAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpcGatewayEndpointAttributeResponseBody self = new GetVpcGatewayEndpointAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpcGatewayEndpointAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setRouteTables(java.util.List<String> routeTables) {
        this.routeTables = routeTables;
        return this;
    }
    public java.util.List<String> getRouteTables() {
        return this.routeTables;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setTags(java.util.List<GetVpcGatewayEndpointAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetVpcGatewayEndpointAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetVpcGatewayEndpointAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class GetVpcGatewayEndpointAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The key of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetVpcGatewayEndpointAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetVpcGatewayEndpointAttributeResponseBodyTags self = new GetVpcGatewayEndpointAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetVpcGatewayEndpointAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetVpcGatewayEndpointAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
