// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarTaskAndActionsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RequestUuid")
    public String requestUuid;

    public static DescribeSoarTaskAndActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarTaskAndActionsRequest self = new DescribeSoarTaskAndActionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarTaskAndActionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSoarTaskAndActionsRequest setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
        return this;
    }
    public String getRequestUuid() {
        return this.requestUuid;
    }

}
