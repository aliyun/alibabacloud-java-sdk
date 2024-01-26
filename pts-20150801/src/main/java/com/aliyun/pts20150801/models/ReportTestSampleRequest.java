// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class ReportTestSampleRequest extends TeaModel {
    @NameInMap("TestSample")
    public String testSample;

    public static ReportTestSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportTestSampleRequest self = new ReportTestSampleRequest();
        return TeaModel.build(map, self);
    }

    public ReportTestSampleRequest setTestSample(String testSample) {
        this.testSample = testSample;
        return this;
    }
    public String getTestSample() {
        return this.testSample;
    }

}
