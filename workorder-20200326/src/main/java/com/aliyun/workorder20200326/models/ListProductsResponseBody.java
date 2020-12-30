// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListProductsResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setData(ListProductsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductsResponseBodyData getData() {
        return this.data;
    }

    public ListProductsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListProductsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProductsResponseBodyDataHotConsultation extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductCode")
        public String productCode;

        public static ListProductsResponseBodyDataHotConsultation build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataHotConsultation self = new ListProductsResponseBodyDataHotConsultation();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataHotConsultation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyDataHotConsultation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyDataHotConsultation setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class ListProductsResponseBodyDataConsultationMore extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductCode")
        public String productCode;

        public static ListProductsResponseBodyDataConsultationMore build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataConsultationMore self = new ListProductsResponseBodyDataConsultationMore();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataConsultationMore setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyDataConsultationMore setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyDataConsultationMore setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class ListProductsResponseBodyDataHotTech extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductCode")
        public String productCode;

        public static ListProductsResponseBodyDataHotTech build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataHotTech self = new ListProductsResponseBodyDataHotTech();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataHotTech setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyDataHotTech setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyDataHotTech setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class ListProductsResponseBodyDataTechMoreProductList extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductCode")
        public String productCode;

        public static ListProductsResponseBodyDataTechMoreProductList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataTechMoreProductList self = new ListProductsResponseBodyDataTechMoreProductList();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataTechMoreProductList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyDataTechMoreProductList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyDataTechMoreProductList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class ListProductsResponseBodyDataTechMore extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ProductList")
        public java.util.List<ListProductsResponseBodyDataTechMoreProductList> productList;

        public static ListProductsResponseBodyDataTechMore build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataTechMore self = new ListProductsResponseBodyDataTechMore();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataTechMore setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListProductsResponseBodyDataTechMore setProductList(java.util.List<ListProductsResponseBodyDataTechMoreProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<ListProductsResponseBodyDataTechMoreProductList> getProductList() {
            return this.productList;
        }

    }

    public static class ListProductsResponseBodyData extends TeaModel {
        @NameInMap("HotConsultation")
        public java.util.List<ListProductsResponseBodyDataHotConsultation> hotConsultation;

        @NameInMap("ConsultationMore")
        public java.util.List<ListProductsResponseBodyDataConsultationMore> consultationMore;

        @NameInMap("HotTech")
        public java.util.List<ListProductsResponseBodyDataHotTech> hotTech;

        @NameInMap("TechMore")
        public java.util.List<ListProductsResponseBodyDataTechMore> techMore;

        public static ListProductsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyData self = new ListProductsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyData setHotConsultation(java.util.List<ListProductsResponseBodyDataHotConsultation> hotConsultation) {
            this.hotConsultation = hotConsultation;
            return this;
        }
        public java.util.List<ListProductsResponseBodyDataHotConsultation> getHotConsultation() {
            return this.hotConsultation;
        }

        public ListProductsResponseBodyData setConsultationMore(java.util.List<ListProductsResponseBodyDataConsultationMore> consultationMore) {
            this.consultationMore = consultationMore;
            return this;
        }
        public java.util.List<ListProductsResponseBodyDataConsultationMore> getConsultationMore() {
            return this.consultationMore;
        }

        public ListProductsResponseBodyData setHotTech(java.util.List<ListProductsResponseBodyDataHotTech> hotTech) {
            this.hotTech = hotTech;
            return this;
        }
        public java.util.List<ListProductsResponseBodyDataHotTech> getHotTech() {
            return this.hotTech;
        }

        public ListProductsResponseBodyData setTechMore(java.util.List<ListProductsResponseBodyDataTechMore> techMore) {
            this.techMore = techMore;
            return this;
        }
        public java.util.List<ListProductsResponseBodyDataTechMore> getTechMore() {
            return this.techMore;
        }

    }

}
