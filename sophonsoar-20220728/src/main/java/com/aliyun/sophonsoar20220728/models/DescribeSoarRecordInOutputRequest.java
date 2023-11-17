// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordInOutputRequest extends TeaModel {
    @NameInMap("ActionUuid")
    public String actionUuid;

    @NameInMap("Lang")
    public String lang;

    public static DescribeSoarRecordInOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordInOutputRequest self = new DescribeSoarRecordInOutputRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordInOutputRequest setActionUuid(String actionUuid) {
        this.actionUuid = actionUuid;
        return this;
    }
    public String getActionUuid() {
        return this.actionUuid;
    }

    public DescribeSoarRecordInOutputRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
