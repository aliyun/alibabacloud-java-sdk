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
         * <br>
         * <p>*   **vendor**: providers.</p>
         * <p>*   **regionIds**: IDs of supported regions</p>
         */
        @NameInMap("MultiValues")
        public String multiValues;

        /**
         * <p>The name of the search condition. Valid values:</p>
         * <br>
         * <p>*   **internetIp**: the public IP address.</p>
         * <p>*   **intranetIp**: the private IP address.</p>
         * <p>*   **instanceName**: the name of the instance.</p>
         * <p>*   **instanceId**: the instance ID.</p>
         * <p>*   **vpcInstanceId**: the ID of the virtual private cloud (VPC) to which the instance belongs.</p>
         * <p>*   **osName**: the operating system.</p>
         * <p>*   **osType**: the operating system type.</p>
         * <p>*   **hcStatus**: indicates whether baseline risks exist.</p>
         * <p>*   **vulStatus**: indicates whether vulnerabilities exist.</p>
         * <p>*   **alarmStatus**: indicates whether security alerts exist.</p>
         * <p>*   **riskStatus**: indicates whether risks exist.</p>
         * <p>*   **clientStatus**: indicates the status of the client.</p>
         * <p>*   **runningStatus**: the running status of the asset.</p>
         * <p>*   **tagName**: the name of the tag.</p>
         * <p>*   **groupName**: the name of the server group.</p>
         * <p>*   **regionId**: the region ID.</p>
         * <p>*   **importance**: the importance of the asset.</p>
         * <p>*   **exposedStatus**: indicates whether the server is exposed.</p>
         * <p>*   **authVersion**: the authorization version.</p>
         * <p>*   **flag**: the cloud service provider.</p>
         * <p>*   **ipList**: the IP addresses.</p>
         * <p>*   **uuidList** :the UUID.</p>
         * <p>*   **tagKeyValue**: the ECS tag.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <br>
         * <p>*   **input**: The search condition needs to be specified.</p>
         * <p>*   **select**: The search condition is an option that can be selected from the drop-down list.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute values of the assets that match the keyword.</p>
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
