// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPreviewgetpreviewownersRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("Source")
    public String source;

    @NameInMap("Stringtarget")
    public String stringtarget;

    public static GetLinkeBahamutPreviewgetpreviewownersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPreviewgetpreviewownersRequest self = new GetLinkeBahamutPreviewgetpreviewownersRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPreviewgetpreviewownersRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public GetLinkeBahamutPreviewgetpreviewownersRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetLinkeBahamutPreviewgetpreviewownersRequest setStringtarget(String stringtarget) {
        this.stringtarget = stringtarget;
        return this;
    }
    public String getStringtarget() {
        return this.stringtarget;
    }

}
