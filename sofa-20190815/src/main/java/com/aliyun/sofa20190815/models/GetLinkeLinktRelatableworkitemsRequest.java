// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktRelatableworkitemsRequest extends TeaModel {
    @NameInMap("FormJsonStr")
    public String formJsonStr;

    @NameInMap("WorkItemRelationType")
    public String workItemRelationType;

    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static GetLinkeLinktRelatableworkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktRelatableworkitemsRequest self = new GetLinkeLinktRelatableworkitemsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktRelatableworkitemsRequest setFormJsonStr(String formJsonStr) {
        this.formJsonStr = formJsonStr;
        return this;
    }
    public String getFormJsonStr() {
        return this.formJsonStr;
    }

    public GetLinkeLinktRelatableworkitemsRequest setWorkItemRelationType(String workItemRelationType) {
        this.workItemRelationType = workItemRelationType;
        return this;
    }
    public String getWorkItemRelationType() {
        return this.workItemRelationType;
    }

    public GetLinkeLinktRelatableworkitemsRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
