// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExcelRecordRequest extends TeaModel {
    // 页码
    @NameInMap("CurrPage")
    public Long currPage;

    // 每页数据
    @NameInMap("PageSize")
    public Long pageSize;

    public static RecognizeExcelRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExcelRecordRequest self = new RecognizeExcelRecordRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeExcelRecordRequest setCurrPage(Long currPage) {
        this.currPage = currPage;
        return this;
    }
    public Long getCurrPage() {
        return this.currPage;
    }

    public RecognizeExcelRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
