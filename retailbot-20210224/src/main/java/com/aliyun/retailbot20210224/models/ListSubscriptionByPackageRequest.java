// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByPackageRequest extends TeaModel {
    // 行业包信息
    @NameInMap("PackageDTO")
    public ListSubscriptionByPackageRequestPackageDTO packageDTO;

    // 分页参数
    @NameInMap("PageData")
    public ListSubscriptionByPackageRequestPageData pageData;

    public static ListSubscriptionByPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByPackageRequest self = new ListSubscriptionByPackageRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByPackageRequest setPackageDTO(ListSubscriptionByPackageRequestPackageDTO packageDTO) {
        this.packageDTO = packageDTO;
        return this;
    }
    public ListSubscriptionByPackageRequestPackageDTO getPackageDTO() {
        return this.packageDTO;
    }

    public ListSubscriptionByPackageRequest setPageData(ListSubscriptionByPackageRequestPageData pageData) {
        this.pageData = pageData;
        return this;
    }
    public ListSubscriptionByPackageRequestPageData getPageData() {
        return this.pageData;
    }

    public static class ListSubscriptionByPackageRequestPackageDTO extends TeaModel {
        // 行业包code
        @NameInMap("PackageCode")
        public String packageCode;

        // 行业包版本
        @NameInMap("PackageVersion")
        public String packageVersion;

        public static ListSubscriptionByPackageRequestPackageDTO build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByPackageRequestPackageDTO self = new ListSubscriptionByPackageRequestPackageDTO();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByPackageRequestPackageDTO setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public ListSubscriptionByPackageRequestPackageDTO setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

    }

    public static class ListSubscriptionByPackageRequestPageData extends TeaModel {
        // 返回的最大记录数
        @NameInMap("MaxResults")
        public Integer maxResults;

        // 下一页的token
        @NameInMap("NextToken")
        public String nextToken;

        public static ListSubscriptionByPackageRequestPageData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionByPackageRequestPageData self = new ListSubscriptionByPackageRequestPageData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionByPackageRequestPageData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListSubscriptionByPackageRequestPageData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
