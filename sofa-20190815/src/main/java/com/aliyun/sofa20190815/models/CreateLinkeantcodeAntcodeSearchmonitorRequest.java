// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeSearchmonitorRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("Query")
    public String query;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Sequence")
    public String sequence;

    @NameInMap("Source")
    public String source;

    @NameInMap("Value")
    public String value;

    public static CreateLinkeantcodeAntcodeSearchmonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeSearchmonitorRequest self = new CreateLinkeantcodeAntcodeSearchmonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeSearchmonitorRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorRequest setSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }
    public String getSequence() {
        return this.sequence;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateLinkeantcodeAntcodeSearchmonitorRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
