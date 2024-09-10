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
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
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
         * <ul>
         * <li><strong>vendor</strong>: providers</li>
         * <li><strong>regionIds</strong>: IDs of supported regions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;vendor&quot;:0,&quot;regionIds&quot;:{&quot;default&quot;:[&quot;ap-southeast-1&quot;,&quot;ap-northeast-2&quot;,&quot;ap-southeast-3&quot;,&quot;ap-southeast-5&quot;,&quot;ap-southeast-7&quot;,&quot;me-central-1&quot;]}},{&quot;vendor&quot;:1,&quot;regionIds&quot;:{&quot;default&quot;:[&quot;outside-of-aliyun&quot;]}}]</p>
         */
        @NameInMap("MultiValues")
        public String multiValues;

        /**
         * <p>The name of the filter condition. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the instance</li>
         * <li><strong>instanceName</strong>: the name of an instance</li>
         * <li><strong>internetIp</strong>: the public IP address</li>
         * <li><strong>riskStatus</strong>: the risk status</li>
         * <li><strong>vendorRegionId</strong>: the region ID by service provider</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the filter condition. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: The filter condition needs to be specified.</li>
         * <li><strong>select</strong>: The filter condition is an option that can be selected from the drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the search condition. This parameter is returned only if the value of <strong>Type</strong> is <strong>select</strong>.</p>
         * <blockquote>
         * <p> If the value of <strong>Type</strong> is <strong>input</strong>, the value of this parameter is an empty string.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fvt*</p>
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
