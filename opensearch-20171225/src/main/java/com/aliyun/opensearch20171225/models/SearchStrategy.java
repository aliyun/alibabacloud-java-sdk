// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class SearchStrategy extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("isDefault")
    public Boolean isDefault;

    @NameInMap("mergeConfig")
    public SearchStrategyMergeConfig mergeConfig;

    @NameInMap("name")
    public String name;

    @NameInMap("searchConfigs")
    public java.util.List<SearchStrategySearchConfigs> searchConfigs;

    public static SearchStrategy build(java.util.Map<String, ?> map) throws Exception {
        SearchStrategy self = new SearchStrategy();
        return TeaModel.build(map, self);
    }

    public SearchStrategy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SearchStrategy setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public SearchStrategy setMergeConfig(SearchStrategyMergeConfig mergeConfig) {
        this.mergeConfig = mergeConfig;
        return this;
    }
    public SearchStrategyMergeConfig getMergeConfig() {
        return this.mergeConfig;
    }

    public SearchStrategy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchStrategy setSearchConfigs(java.util.List<SearchStrategySearchConfigs> searchConfigs) {
        this.searchConfigs = searchConfigs;
        return this;
    }
    public java.util.List<SearchStrategySearchConfigs> getSearchConfigs() {
        return this.searchConfigs;
    }

    public static class SearchStrategyMergeConfig extends TeaModel {
        @NameInMap("docCount")
        public Integer docCount;

        @NameInMap("rankName")
        public String rankName;

        public static SearchStrategyMergeConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchStrategyMergeConfig self = new SearchStrategyMergeConfig();
            return TeaModel.build(map, self);
        }

        public SearchStrategyMergeConfig setDocCount(Integer docCount) {
            this.docCount = docCount;
            return this;
        }
        public Integer getDocCount() {
            return this.docCount;
        }

        public SearchStrategyMergeConfig setRankName(String rankName) {
            this.rankName = rankName;
            return this;
        }
        public String getRankName() {
            return this.rankName;
        }

    }

    public static class SearchStrategySearchConfigs extends TeaModel {
        @NameInMap("firstRankName")
        public String firstRankName;

        @NameInMap("mergeProportion")
        public Integer mergeProportion;

        @NameInMap("queryType")
        public String queryType;

        @NameInMap("secondRankName")
        public String secondRankName;

        public static SearchStrategySearchConfigs build(java.util.Map<String, ?> map) throws Exception {
            SearchStrategySearchConfigs self = new SearchStrategySearchConfigs();
            return TeaModel.build(map, self);
        }

        public SearchStrategySearchConfigs setFirstRankName(String firstRankName) {
            this.firstRankName = firstRankName;
            return this;
        }
        public String getFirstRankName() {
            return this.firstRankName;
        }

        public SearchStrategySearchConfigs setMergeProportion(Integer mergeProportion) {
            this.mergeProportion = mergeProportion;
            return this;
        }
        public Integer getMergeProportion() {
            return this.mergeProportion;
        }

        public SearchStrategySearchConfigs setQueryType(String queryType) {
            this.queryType = queryType;
            return this;
        }
        public String getQueryType() {
            return this.queryType;
        }

        public SearchStrategySearchConfigs setSecondRankName(String secondRankName) {
            this.secondRankName = secondRankName;
            return this;
        }
        public String getSecondRankName() {
            return this.secondRankName;
        }

    }

}
