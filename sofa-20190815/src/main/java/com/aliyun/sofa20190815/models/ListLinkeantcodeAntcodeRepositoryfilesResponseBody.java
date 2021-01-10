// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeantcodeAntcodeRepositoryfilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResponseContent")
    public String responseContent;

    @NameInMap("ResponsePage")
    public String responsePage;

    @NameInMap("ResponsePageInfoNextPage")
    public String responsePageInfoNextPage;

    @NameInMap("ResponsePageInfoPerPage")
    public String responsePageInfoPerPage;

    @NameInMap("ResponsePageInfoPrevPage")
    public String responsePageInfoPrevPage;

    @NameInMap("ResponsePageInfoTotal")
    public String responsePageInfoTotal;

    @NameInMap("ResponsePageInfoTotalPages")
    public String responsePageInfoTotalPages;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    public static ListLinkeantcodeAntcodeRepositoryfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeantcodeAntcodeRepositoryfilesResponseBody self = new ListLinkeantcodeAntcodeRepositoryfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResponseContent(String responseContent) {
        this.responseContent = responseContent;
        return this;
    }
    public String getResponseContent() {
        return this.responseContent;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResponsePage(String responsePage) {
        this.responsePage = responsePage;
        return this;
    }
    public String getResponsePage() {
        return this.responsePage;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResponsePageInfoNextPage(String responsePageInfoNextPage) {
        this.responsePageInfoNextPage = responsePageInfoNextPage;
        return this;
    }
    public String getResponsePageInfoNextPage() {
        return this.responsePageInfoNextPage;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResponsePageInfoPerPage(String responsePageInfoPerPage) {
        this.responsePageInfoPerPage = responsePageInfoPerPage;
        return this;
    }
    public String getResponsePageInfoPerPage() {
        return this.responsePageInfoPerPage;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResponsePageInfoPrevPage(String responsePageInfoPrevPage) {
        this.responsePageInfoPrevPage = responsePageInfoPrevPage;
        return this;
    }
    public String getResponsePageInfoPrevPage() {
        return this.responsePageInfoPrevPage;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResponsePageInfoTotal(String responsePageInfoTotal) {
        this.responsePageInfoTotal = responsePageInfoTotal;
        return this;
    }
    public String getResponsePageInfoTotal() {
        return this.responsePageInfoTotal;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResponsePageInfoTotalPages(String responsePageInfoTotalPages) {
        this.responsePageInfoTotalPages = responsePageInfoTotalPages;
        return this;
    }
    public String getResponsePageInfoTotalPages() {
        return this.responsePageInfoTotalPages;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
