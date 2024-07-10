// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCovidTestReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MultipleResult")
    public Boolean multipleResult;

    /**
     * <strong>example:</strong>
     * <p><a href="http://duguang-database-public.oss-cn-hangzhou.aliyuncs.com/covid_init_covid_test_report/test_report__data_pool_15a4f85478cb1bd69a5d631b182aba69.jpg_item_0_cls_covid_test_report.jpg">http://duguang-database-public.oss-cn-hangzhou.aliyuncs.com/covid_init_covid_test_report/test_report__data_pool_15a4f85478cb1bd69a5d631b182aba69.jpg_item_0_cls_covid_test_report.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeCovidTestReportRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCovidTestReportRequest self = new RecognizeCovidTestReportRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCovidTestReportRequest setMultipleResult(Boolean multipleResult) {
        this.multipleResult = multipleResult;
        return this;
    }
    public Boolean getMultipleResult() {
        return this.multipleResult;
    }

    public RecognizeCovidTestReportRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeCovidTestReportRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
