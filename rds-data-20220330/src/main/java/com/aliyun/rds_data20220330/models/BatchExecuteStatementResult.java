// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class BatchExecuteStatementResult extends TeaModel {
    @NameInMap("GeneratedFieldsList")
    public java.util.List<java.util.List<Field>> generatedFieldsList;

    public static BatchExecuteStatementResult build(java.util.Map<String, ?> map) throws Exception {
        BatchExecuteStatementResult self = new BatchExecuteStatementResult();
        return TeaModel.build(map, self);
    }

    public BatchExecuteStatementResult setGeneratedFieldsList(java.util.List<java.util.List<Field>> generatedFieldsList) {
        this.generatedFieldsList = generatedFieldsList;
        return this;
    }
    public java.util.List<java.util.List<Field>> getGeneratedFieldsList() {
        return this.generatedFieldsList;
    }

}
