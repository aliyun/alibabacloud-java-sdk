// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DismissNumberDistrictInfoParsingResultRequest extends TeaModel {
    @NameInMap("VersionId")
    public String versionId;

    public static DismissNumberDistrictInfoParsingResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DismissNumberDistrictInfoParsingResultRequest self = new DismissNumberDistrictInfoParsingResultRequest();
        return TeaModel.build(map, self);
    }

    public DismissNumberDistrictInfoParsingResultRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
