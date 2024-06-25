// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ResultDatabasesFunctionsValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>gfasdds2****2wfrkv</p>
     */
    @NameInMap("signatures")
    public String signatures;

    public static ResultDatabasesFunctionsValue build(java.util.Map<String, ?> map) throws Exception {
        ResultDatabasesFunctionsValue self = new ResultDatabasesFunctionsValue();
        return TeaModel.build(map, self);
    }

    public ResultDatabasesFunctionsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResultDatabasesFunctionsValue setSignatures(String signatures) {
        this.signatures = signatures;
        return this;
    }
    public String getSignatures() {
        return this.signatures;
    }

}
