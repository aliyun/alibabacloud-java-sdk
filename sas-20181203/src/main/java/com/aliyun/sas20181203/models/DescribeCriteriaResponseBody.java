// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaResponseBody extends TeaModel {
    /**
     * <p>The information about the search conditions of assets.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8E6DDACF-99AF-5939-AFFD-FCCD3B01E724</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCriteriaResponseBody self = new DescribeCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCriteriaResponseBody setCriteriaList(java.util.List<DescribeCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCriteriaResponseBodyCriteriaList extends TeaModel {
        /**
         * <p>The structured attribute values of the assets that match the keyword. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>vendor</strong>: providers.</li>
         * <li><strong>regionIds</strong>: IDs of supported regions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;vendor&quot;:0,&quot;regionIds&quot;:{&quot;default&quot;:[&quot;ap-southeast-1&quot;,&quot;ap-northeast-2&quot;,&quot;ap-southeast-3&quot;,&quot;ap-southeast-5&quot;,&quot;ap-southeast-7&quot;,&quot;me-central-1&quot;]}},{&quot;vendor&quot;:1,&quot;regionIds&quot;:{&quot;default&quot;:[&quot;outside-of-aliyun&quot;]}}]</p>
         */
        @NameInMap("MultiValues")
        public String multiValues;

        /**
         * <p>The name of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>internetIp</strong>: the public IP address.</li>
         * <li><strong>intranetIp</strong>: the private IP address.</li>
         * <li><strong>instanceName</strong>: the name of the instance.</li>
         * <li><strong>instanceId</strong>: the instance ID.</li>
         * <li><strong>vpcInstanceId</strong>: The ID of the virtual private cloud (VPC) to which the instance belongs.</li>
         * <li><strong>osName</strong>: the operating system.</li>
         * <li><strong>osType</strong>: the operating system type.</li>
         * <li><strong>hcStatus</strong>: indicates whether baseline risks exist.</li>
         * <li><strong>vulStatus</strong>: indicates whether vulnerabilities exist.</li>
         * <li><strong>alarmStatus</strong>: indicates whether security alerts exist.</li>
         * <li><strong>riskStatus</strong>: indicates whether risks exist.</li>
         * <li><strong>clientStatus</strong>: indicates the status of the client.</li>
         * <li><strong>runningStatus</strong>: the running status of the asset.</li>
         * <li><strong>tagName</strong>: the name of the tag.</li>
         * <li><strong>groupName</strong>: the name of the server group.</li>
         * <li><strong>regionId</strong>: the region ID.</li>
         * <li><strong>importance</strong>: the importance of the asset.</li>
         * <li><strong>exposedStatus</strong>: indicates whether the server is exposed.</li>
         * <li><strong>authVersion</strong>: the authorization version.</li>
         * <li><strong>flag</strong>: the cloud service provider.</li>
         * <li><strong>ipList</strong>: the IP address list.</li>
         * <li><strong>uuidList</strong> :the UUID.</li>
         * <li><strong>tagKeyValue</strong>: the ECS tag.</li>
         * <li><strong>vendorAuthAlias</strong>: the account name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internetIp</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: The search condition needs to be specified.</li>
         * <li><strong>select</strong>: The search condition is an option that can be selected from the drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute values of the assets that match the keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>47.96.XX.XX</p>
         */
        @NameInMap("Values")
        public String values;

        public static DescribeCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCriteriaResponseBodyCriteriaList self = new DescribeCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeCriteriaResponseBodyCriteriaList setMultiValues(String multiValues) {
            this.multiValues = multiValues;
            return this;
        }
        public String getMultiValues() {
            return this.multiValues;
        }

        public DescribeCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
