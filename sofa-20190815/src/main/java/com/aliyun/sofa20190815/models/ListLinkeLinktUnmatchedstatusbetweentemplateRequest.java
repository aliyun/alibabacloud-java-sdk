// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktUnmatchedstatusbetweentemplateRequest extends TeaModel {
    @NameInMap("ConvertTemplateId")
    public String convertTemplateId;

    @NameInMap("OriginTemplateId")
    public String originTemplateId;

    public static ListLinkeLinktUnmatchedstatusbetweentemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktUnmatchedstatusbetweentemplateRequest self = new ListLinkeLinktUnmatchedstatusbetweentemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktUnmatchedstatusbetweentemplateRequest setConvertTemplateId(String convertTemplateId) {
        this.convertTemplateId = convertTemplateId;
        return this;
    }
    public String getConvertTemplateId() {
        return this.convertTemplateId;
    }

    public ListLinkeLinktUnmatchedstatusbetweentemplateRequest setOriginTemplateId(String originTemplateId) {
        this.originTemplateId = originTemplateId;
        return this;
    }
    public String getOriginTemplateId() {
        return this.originTemplateId;
    }

}
