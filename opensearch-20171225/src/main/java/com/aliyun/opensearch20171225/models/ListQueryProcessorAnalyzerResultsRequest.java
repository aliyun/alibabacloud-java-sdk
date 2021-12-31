// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorAnalyzerResultsRequest extends TeaModel {
    @NameInMap("text")
    public String text;

    public static ListQueryProcessorAnalyzerResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorAnalyzerResultsRequest self = new ListQueryProcessorAnalyzerResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorAnalyzerResultsRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
