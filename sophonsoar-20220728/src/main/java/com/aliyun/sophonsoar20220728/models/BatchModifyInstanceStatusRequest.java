// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class BatchModifyInstanceStatusRequest extends TeaModel {
    @NameInMap("Active")
    public Integer active;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static BatchModifyInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyInstanceStatusRequest self = new BatchModifyInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchModifyInstanceStatusRequest setActive(Integer active) {
        this.active = active;
        return this;
    }
    public Integer getActive() {
        return this.active;
    }

    public BatchModifyInstanceStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BatchModifyInstanceStatusRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
