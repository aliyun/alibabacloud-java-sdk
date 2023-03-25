// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetCriteriaResponseBody extends TeaModel {
    /**
     * <p>An array consisting of the information about the filter conditions that are used to search for cloud assets.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<GetCloudAssetCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAssetCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetCriteriaResponseBody self = new GetCloudAssetCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetCriteriaResponseBody setCriteriaList(java.util.List<GetCloudAssetCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<GetCloudAssetCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public GetCloudAssetCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAssetCriteriaResponseBodyCriteriaList extends TeaModel {
        /**
         * <p>The structured attribute values of the assets that match the keyword. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <br>
         * <p>*   **vendor**: providers</p>
         * <p>*   **regionIds**: IDs of supported regions</p>
         */
        @NameInMap("MultiValues")
        public String multiValues;

        /**
         * <p>The name of the filter condition. Valid values:</p>
         * <br>
         * <p>*   **instanceId**: the ID of the instance</p>
         * <p>*   **instanceName**: the name of an instance</p>
         * <p>*   **internetIp**: the public IP address</p>
         * <p>*   **riskStatus**: the risk status</p>
         * <p>*   **vendorRegionId**: the region ID by service provider</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the filter condition. Valid values:</p>
         * <br>
         * <p>*   **input**: The filter condition needs to be specified.</p>
         * <p>*   **select**: The filter condition is an option that can be selected from the drop-down list.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the search condition. This parameter is returned only if the value of **Type** is **select**.</p>
         * <br>
         * <p>>  If the value of **Type** is **input**, the value of this parameter is an empty string.</p>
         */
        @NameInMap("Values")
        public String values;

        public static GetCloudAssetCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetCriteriaResponseBodyCriteriaList self = new GetCloudAssetCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetCriteriaResponseBodyCriteriaList setMultiValues(String multiValues) {
            this.multiValues = multiValues;
            return this;
        }
        public String getMultiValues() {
            return this.multiValues;
        }

        public GetCloudAssetCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCloudAssetCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCloudAssetCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
