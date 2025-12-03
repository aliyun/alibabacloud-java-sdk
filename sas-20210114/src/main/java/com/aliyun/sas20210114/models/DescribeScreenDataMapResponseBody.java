// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenDataMapResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-XXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SasScreenTypeList")
    public java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeList> sasScreenTypeList;

    public static DescribeScreenDataMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenDataMapResponseBody self = new DescribeScreenDataMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenDataMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenDataMapResponseBody setSasScreenTypeList(java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeList> sasScreenTypeList) {
        this.sasScreenTypeList = sasScreenTypeList;
        return this;
    }
    public java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeList> getSasScreenTypeList() {
        return this.sasScreenTypeList;
    }

    public static class DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>second</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate self = new DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate();
            return TeaModel.build(map, self);
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeScreenDataMapResponseBodySasScreenTypeListTypeData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>VUL_VUL</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Date")
        public java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate> date;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Title")
        public String title;

        public static DescribeScreenDataMapResponseBodySasScreenTypeListTypeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenDataMapResponseBodySasScreenTypeListTypeData self = new DescribeScreenDataMapResponseBodySasScreenTypeListTypeData();
            return TeaModel.build(map, self);
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeListTypeData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeListTypeData setDate(java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate> date) {
            this.date = date;
            return this;
        }
        public java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeListTypeDataDate> getDate() {
            return this.date;
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeListTypeData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeListTypeData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeScreenDataMapResponseBodySasScreenTypeList extends TeaModel {
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>ASSETS</p>
         */
        @NameInMap("TypeCode")
        public String typeCode;

        @NameInMap("TypeData")
        public java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeListTypeData> typeData;

        public static DescribeScreenDataMapResponseBodySasScreenTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenDataMapResponseBodySasScreenTypeList self = new DescribeScreenDataMapResponseBodySasScreenTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeList setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public DescribeScreenDataMapResponseBodySasScreenTypeList setTypeData(java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeListTypeData> typeData) {
            this.typeData = typeData;
            return this;
        }
        public java.util.List<DescribeScreenDataMapResponseBodySasScreenTypeListTypeData> getTypeData() {
            return this.typeData;
        }

    }

}
