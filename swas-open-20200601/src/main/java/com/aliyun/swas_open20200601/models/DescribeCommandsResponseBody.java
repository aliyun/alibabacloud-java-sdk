// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCommandsResponseBody extends TeaModel {
    @NameInMap("Commands")
    public java.util.List<DescribeCommandsResponseBodyCommands> commands;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandsResponseBody self = new DescribeCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommandsResponseBody setCommands(java.util.List<DescribeCommandsResponseBodyCommands> commands) {
        this.commands = commands;
        return this;
    }
    public java.util.List<DescribeCommandsResponseBodyCommands> getCommands() {
        return this.commands;
    }

    public DescribeCommandsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommandsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommandsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCommandsResponseBodyCommandsParameterDefinitions extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("PossibleValues")
        public java.util.List<String> possibleValues;

        @NameInMap("Required")
        public Boolean required;

        public static DescribeCommandsResponseBodyCommandsParameterDefinitions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsParameterDefinitions self = new DescribeCommandsResponseBodyCommandsParameterDefinitions();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setPossibleValues(java.util.List<String> possibleValues) {
            this.possibleValues = possibleValues;
            return this;
        }
        public java.util.List<String> getPossibleValues() {
            return this.possibleValues;
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class DescribeCommandsResponseBodyCommands extends TeaModel {
        @NameInMap("CommandContent")
        public String commandContent;

        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnableParameter")
        public Boolean enableParameter;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParameterDefinitions")
        public java.util.List<DescribeCommandsResponseBodyCommandsParameterDefinitions> parameterDefinitions;

        @NameInMap("ParameterNames")
        public java.util.List<String> parameterNames;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeCommandsResponseBodyCommands build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommands self = new DescribeCommandsResponseBodyCommands();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommands setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeCommandsResponseBodyCommands setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeCommandsResponseBodyCommands setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCommandsResponseBodyCommands setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommandsResponseBodyCommands setEnableParameter(Boolean enableParameter) {
            this.enableParameter = enableParameter;
            return this;
        }
        public Boolean getEnableParameter() {
            return this.enableParameter;
        }

        public DescribeCommandsResponseBodyCommands setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCommandsResponseBodyCommands setParameterDefinitions(java.util.List<DescribeCommandsResponseBodyCommandsParameterDefinitions> parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public java.util.List<DescribeCommandsResponseBodyCommandsParameterDefinitions> getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        public DescribeCommandsResponseBodyCommands setParameterNames(java.util.List<String> parameterNames) {
            this.parameterNames = parameterNames;
            return this;
        }
        public java.util.List<String> getParameterNames() {
            return this.parameterNames;
        }

        public DescribeCommandsResponseBodyCommands setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public DescribeCommandsResponseBodyCommands setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeCommandsResponseBodyCommands setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCommandsResponseBodyCommands setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

}
