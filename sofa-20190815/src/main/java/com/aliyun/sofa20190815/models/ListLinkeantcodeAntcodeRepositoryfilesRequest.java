// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeantcodeAntcodeRepositoryfilesRequest extends TeaModel {
    @NameInMap("FilePathRepeatList")
    public java.util.List<String> filePathRepeatList;

    @NameInMap("Id")
    public String id;

    @NameInMap("Page")
    public String page;

    @NameInMap("PerPage")
    public String perPage;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ListLinkeantcodeAntcodeRepositoryfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeantcodeAntcodeRepositoryfilesRequest self = new ListLinkeantcodeAntcodeRepositoryfilesRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeantcodeAntcodeRepositoryfilesRequest setFilePathRepeatList(java.util.List<String> filePathRepeatList) {
        this.filePathRepeatList = filePathRepeatList;
        return this;
    }
    public java.util.List<String> getFilePathRepeatList() {
        return this.filePathRepeatList;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesRequest setPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }
    public String getPerPage() {
        return this.perPage;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
