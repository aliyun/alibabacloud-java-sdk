// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetCriteriaResponseBody extends TeaModel {
    @NameInMap("CriteriaList")
    public java.util.List<GetCloudAssetCriteriaResponseBodyCriteriaList> criteriaList;

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
        @NameInMap("MultiValues")
        public String multiValues;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

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
