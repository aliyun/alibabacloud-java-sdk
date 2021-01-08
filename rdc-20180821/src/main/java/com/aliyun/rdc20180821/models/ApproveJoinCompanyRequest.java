// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class ApproveJoinCompanyRequest extends TeaModel {
    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    @NameInMap("ApplicationIds")
    public String applicationIds;

    public static ApproveJoinCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveJoinCompanyRequest self = new ApproveJoinCompanyRequest();
        return TeaModel.build(map, self);
    }

    public ApproveJoinCompanyRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public ApproveJoinCompanyRequest setApplicationIds(String applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public String getApplicationIds() {
        return this.applicationIds;
    }

}
