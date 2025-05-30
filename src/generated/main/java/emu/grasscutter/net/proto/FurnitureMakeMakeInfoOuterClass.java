// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeMakeInfo.proto

package emu.grasscutter.net.proto;

public final class FurnitureMakeMakeInfoOuterClass {
  private FurnitureMakeMakeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeMakeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeMakeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 make_count = 8;</code>
     * @return The makeCount.
     */
    int getMakeCount();

    /**
     * <code>uint32 furniture_id = 15;</code>
     * @return The furnitureId.
     */
    int getFurnitureId();
  }
  /**
   * Protobuf type {@code FurnitureMakeMakeInfo}
   */
  public static final class FurnitureMakeMakeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeMakeInfo)
      FurnitureMakeMakeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeMakeInfo.newBuilder() to construct.
    private FurnitureMakeMakeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeMakeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeMakeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FurnitureMakeMakeInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 64: {

              makeCount_ = input.readUInt32();
              break;
            }
            case 120: {

              furnitureId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.class, emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder.class);
    }

    public static final int MAKE_COUNT_FIELD_NUMBER = 8;
    private int makeCount_;
    /**
     * <code>uint32 make_count = 8;</code>
     * @return The makeCount.
     */
    @java.lang.Override
    public int getMakeCount() {
      return makeCount_;
    }

    public static final int FURNITURE_ID_FIELD_NUMBER = 15;
    private int furnitureId_;
    /**
     * <code>uint32 furniture_id = 15;</code>
     * @return The furnitureId.
     */
    @java.lang.Override
    public int getFurnitureId() {
      return furnitureId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (makeCount_ != 0) {
        output.writeUInt32(8, makeCount_);
      }
      if (furnitureId_ != 0) {
        output.writeUInt32(15, furnitureId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (makeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, makeCount_);
      }
      if (furnitureId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, furnitureId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo other = (emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo) obj;

      if (getMakeCount()
          != other.getMakeCount()) return false;
      if (getFurnitureId()
          != other.getFurnitureId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MAKE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMakeCount();
      hash = (37 * hash) + FURNITURE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFurnitureId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code FurnitureMakeMakeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeMakeInfo)
        emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.class, emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        makeCount_ = 0;

        furnitureId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo build() {
        emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo buildPartial() {
        emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo result = new emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo(this);
        result.makeCount_ = makeCount_;
        result.furnitureId_ = furnitureId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo other) {
        if (other == emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.getDefaultInstance()) return this;
        if (other.getMakeCount() != 0) {
          setMakeCount(other.getMakeCount());
        }
        if (other.getFurnitureId() != 0) {
          setFurnitureId(other.getFurnitureId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int makeCount_ ;
      /**
       * <code>uint32 make_count = 8;</code>
       * @return The makeCount.
       */
      @java.lang.Override
      public int getMakeCount() {
        return makeCount_;
      }
      /**
       * <code>uint32 make_count = 8;</code>
       * @param value The makeCount to set.
       * @return This builder for chaining.
       */
      public Builder setMakeCount(int value) {
        
        makeCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 make_count = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMakeCount() {
        
        makeCount_ = 0;
        onChanged();
        return this;
      }

      private int furnitureId_ ;
      /**
       * <code>uint32 furniture_id = 15;</code>
       * @return The furnitureId.
       */
      @java.lang.Override
      public int getFurnitureId() {
        return furnitureId_;
      }
      /**
       * <code>uint32 furniture_id = 15;</code>
       * @param value The furnitureId to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureId(int value) {
        
        furnitureId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 furniture_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureId() {
        
        furnitureId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FurnitureMakeMakeInfo)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeMakeInfo)
    private static final emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo();
    }

    public static emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeMakeInfo>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeMakeInfo>() {
      @java.lang.Override
      public FurnitureMakeMakeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FurnitureMakeMakeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FurnitureMakeMakeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeMakeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeMakeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeMakeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033FurnitureMakeMakeInfo.proto\"A\n\025Furnitu" +
      "reMakeMakeInfo\022\022\n\nmake_count\030\010 \001(\r\022\024\n\014fu" +
      "rniture_id\030\017 \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FurnitureMakeMakeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeMakeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeMakeInfo_descriptor,
        new java.lang.String[] { "MakeCount", "FurnitureId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
