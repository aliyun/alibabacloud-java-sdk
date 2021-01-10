// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeComplexfindfilesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestJsonStr")
    public String requestJsonStr;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeComplexfindfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeComplexfindfilesRequest self = new ExecLinkeantcodeAntcodeComplexfindfilesRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeComplexfindfilesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeComplexfindfilesRequest setRequestJsonStr(String requestJsonStr) {
        this.requestJsonStr = requestJsonStr;
        return this;
    }
    public String getRequestJsonStr() {
        return this.requestJsonStr;
    }

    public ExecLinkeantcodeAntcodeComplexfindfilesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
