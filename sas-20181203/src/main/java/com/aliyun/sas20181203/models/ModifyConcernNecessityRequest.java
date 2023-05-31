// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyConcernNecessityRequest extends TeaModel {
    /**
     * <p>The priorities to fix the vulnerabilities. Valid values:</p>
     * <br>
     * <p>*   asap: high</p>
     * <p>*   later: medium</p>
     * <p>*   nntf: low</p>
     */
    @NameInMap("ConcernNecessity")
    public String concernNecessity;

    public static ModifyConcernNecessityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConcernNecessityRequest self = new ModifyConcernNecessityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConcernNecessityRequest setConcernNecessity(String concernNecessity) {
        this.concernNecessity = concernNecessity;
        return this;
    }
    public String getConcernNecessity() {
        return this.concernNecessity;
    }

}
