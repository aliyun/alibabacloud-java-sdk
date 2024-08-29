// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20240820.models;

import com.aliyun.tea.*;

public class PredictSseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("dbName")
    public String dbName;

    @NameInMap("input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>_polar4ai_tongyi</p>
     */
    @NameInMap("modelClass")
    public String modelClass;

    /**
     * <strong>example:</strong>
     * <p>{&quot;basic_index_name&quot;:&quot;index_table&quot;}</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static PredictSseRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictSseRequest self = new PredictSseRequest();
        return TeaModel.build(map, self);
    }

    public PredictSseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public PredictSseRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public PredictSseRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public PredictSseRequest setModelClass(String modelClass) {
        this.modelClass = modelClass;
        return this;
    }
    public String getModelClass() {
        return this.modelClass;
    }

    public PredictSseRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
