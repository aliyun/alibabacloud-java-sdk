// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeDeleteExcelRecordRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static RecognizeDeleteExcelRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDeleteExcelRecordRequest self = new RecognizeDeleteExcelRecordRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeDeleteExcelRecordRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
