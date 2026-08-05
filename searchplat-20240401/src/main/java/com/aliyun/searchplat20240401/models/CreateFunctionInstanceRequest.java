// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateFunctionInstanceRequest extends TeaModel {
    /**
     * <p>The creation parameters.</p>
     */
    @NameInMap("createParameters")
    public java.util.List<CreateFunctionInstanceRequestCreateParameters> createParameters;

    /**
     * <p>The instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li>PAAS</li>
     * <li>SAAS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAAS</p>
     */
    @NameInMap("functionType")
    public String functionType;

    /**
     * <p>The configuration or model name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The service ID. Valid values:</p>
     * <ul>
     * <li>ops-query-analyze-nl2sql-001</li>
     * <li>ops-embedding-dim-reduction-001: vector dimension reduction.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ops-query-analyze-nl2sql-001</p>
     */
    @NameInMap("modelType")
    public String modelType;

    public static CreateFunctionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionInstanceRequest self = new CreateFunctionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionInstanceRequest setCreateParameters(java.util.List<CreateFunctionInstanceRequestCreateParameters> createParameters) {
        this.createParameters = createParameters;
        return this;
    }
    public java.util.List<CreateFunctionInstanceRequestCreateParameters> getCreateParameters() {
        return this.createParameters;
    }

    public CreateFunctionInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFunctionInstanceRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public CreateFunctionInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateFunctionInstanceRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public static class CreateFunctionInstanceRequestCreateParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>config</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;DDL\&quot;: [{\&quot;table\&quot;: \&quot;schools\&quot;,\&quot;columns\&quot;: [{\&quot;column\&quot;: \&quot;class\&quot;,\&quot;column_des\&quot;: \&quot;班级\&quot;,\&quot;type\&quot;: \&quot;str\&quot;,\&quot;example\&quot;: [\&quot;高一3班\&quot;,\&quot;火箭班\&quot;],\&quot;value_mapping\&quot;: {}},{\&quot;column\&quot;: \&quot;school\&quot;,\&quot;column_des\&quot;: \&quot;学校\&quot;,\&quot;type\&quot;: \&quot;str\&quot;,\&quot;example\&quot;: [\&quot;清华大学\&quot;,\&quot;北京大学\&quot;],\&quot;value_mapping\&quot;: {}}]},{\&quot;table\&quot;: \&quot;students\&quot;,\&quot;columns\&quot;: [{\&quot;column\&quot;: \&quot;name\&quot;,\&quot;column_des\&quot;: \&quot;姓名\&quot;,\&quot;type\&quot;: \&quot;int\&quot;,\&quot;example\&quot;: [10002,100001],\&quot;value_mapping\&quot;: [[10002,100001],[\&quot;张三\&quot;,\&quot;李四\&quot;]]}]}],\&quot;foreign keys\&quot;:[\&quot;table.column_1=table2.column_2\&quot;,\&quot;table.column_1=table2.column_2\&quot;],\&quot;UDF\&quot;: [[\&quot;初始节点\&quot;,\&quot;aa\&quot;],[\&quot; (sub_action &gt;100095 or action = 0001) and station =100001\&quot;,\&quot;bbb\&quot;]],\&quot;Fewshot\&quot;: [{\&quot;query\&quot;: \&quot;叫张三的学生有多少\&quot;,\&quot;sql\&quot;: \&quot;SELECT COUNT(*) FROM students WHERE name = 10002\&quot;}]}</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateFunctionInstanceRequestCreateParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateFunctionInstanceRequestCreateParameters self = new CreateFunctionInstanceRequestCreateParameters();
            return TeaModel.build(map, self);
        }

        public CreateFunctionInstanceRequestCreateParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFunctionInstanceRequestCreateParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
