// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDataSourceResponseBody extends TeaModel {
    /**
     * <p>The metadata of the data sources.</p>
     */
    @NameInMap("MetaDatas")
    public java.util.List<DescribeDataSourceResponseBodyMetaDatas> metaDatas;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceResponseBody self = new DescribeDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceResponseBody setMetaDatas(java.util.List<DescribeDataSourceResponseBodyMetaDatas> metaDatas) {
        this.metaDatas = metaDatas;
        return this;
    }
    public java.util.List<DescribeDataSourceResponseBodyMetaDatas> getMetaDatas() {
        return this.metaDatas;
    }

    public DescribeDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList extends TeaModel {
        /**
         * <p>The description of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk_vul</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>regex</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList self = new DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDataSourceResponseBodyMetaDatasMetaDataFields extends TeaModel {
        /**
         * <p>The key of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Filed")
        public String filed;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk_vul_type</p>
         */
        @NameInMap("FiledName")
        public String filedName;

        /**
         * <p>The operators.</p>
         */
        @NameInMap("OperatorList")
        public java.util.List<DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList> operatorList;

        /**
         * <p>The sample field.</p>
         * 
         * <strong>example:</strong>
         * <p>all:dingtalk_all;cms:dingtalk_vul_cms;oval:dingtalk_vul_cve;sys:dingtalk_vul_sys;emg:dingtalk_vul_emg</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>The value type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static DescribeDataSourceResponseBodyMetaDatasMetaDataFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceResponseBodyMetaDatasMetaDataFields self = new DescribeDataSourceResponseBodyMetaDatasMetaDataFields();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceResponseBodyMetaDatasMetaDataFields setFiled(String filed) {
            this.filed = filed;
            return this;
        }
        public String getFiled() {
            return this.filed;
        }

        public DescribeDataSourceResponseBodyMetaDatasMetaDataFields setFiledName(String filedName) {
            this.filedName = filedName;
            return this;
        }
        public String getFiledName() {
            return this.filedName;
        }

        public DescribeDataSourceResponseBodyMetaDatasMetaDataFields setOperatorList(java.util.List<DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList> operatorList) {
            this.operatorList = operatorList;
            return this;
        }
        public java.util.List<DescribeDataSourceResponseBodyMetaDatasMetaDataFieldsOperatorList> getOperatorList() {
            return this.operatorList;
        }

        public DescribeDataSourceResponseBodyMetaDatasMetaDataFields setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public DescribeDataSourceResponseBodyMetaDatasMetaDataFields setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class DescribeDataSourceResponseBodyMetaDatas extends TeaModel {
        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1753</p>
         */
        @NameInMap("DataSourceId")
        public Integer dataSourceId;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_analysis_pre-sas-operation-log-sas-event-suspicious</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk_suspicious</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The metadata files.</p>
         */
        @NameInMap("MetaDataFields")
        public java.util.List<DescribeDataSourceResponseBodyMetaDatasMetaDataFields> metaDataFields;

        public static DescribeDataSourceResponseBodyMetaDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceResponseBodyMetaDatas self = new DescribeDataSourceResponseBodyMetaDatas();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceResponseBodyMetaDatas setDataSourceId(Integer dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Integer getDataSourceId() {
            return this.dataSourceId;
        }

        public DescribeDataSourceResponseBodyMetaDatas setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public DescribeDataSourceResponseBodyMetaDatas setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataSourceResponseBodyMetaDatas setMetaDataFields(java.util.List<DescribeDataSourceResponseBodyMetaDatasMetaDataFields> metaDataFields) {
            this.metaDataFields = metaDataFields;
            return this;
        }
        public java.util.List<DescribeDataSourceResponseBodyMetaDatasMetaDataFields> getMetaDataFields() {
            return this.metaDataFields;
        }

    }

}
