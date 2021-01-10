// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktCustomfieldorderRequest extends TeaModel {
    @NameInMap("CustomFieldVOListRepeatList")
    public java.util.List<Long> customFieldVOListRepeatList;

    @NameInMap("TemplateId")
    public String templateId;

    public static SaveLinkeLinktCustomfieldorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktCustomfieldorderRequest self = new SaveLinkeLinktCustomfieldorderRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktCustomfieldorderRequest setCustomFieldVOListRepeatList(java.util.List<Long> customFieldVOListRepeatList) {
        this.customFieldVOListRepeatList = customFieldVOListRepeatList;
        return this;
    }
    public java.util.List<Long> getCustomFieldVOListRepeatList() {
        return this.customFieldVOListRepeatList;
    }

    public SaveLinkeLinktCustomfieldorderRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
